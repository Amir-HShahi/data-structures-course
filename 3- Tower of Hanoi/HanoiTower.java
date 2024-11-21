import java.util.ArrayList;

public class HanoiTower {
    int i = 0;
    private int diskCount;
    ArrayList<Tower> towers = new ArrayList<Tower>();

    public HanoiTower(int diskCount) {
        for (int i = 3; i > 0; i--) {
            towers.add(new Tower());
        }
        this.diskCount = diskCount;
        for (int i = this.diskCount; i > 0; i--) {
            towers.get(0).pushDisk(new Disk(i));
        }
    }

    public void solve() {
        while (towers.get(2).size() != diskCount) {
            for (Tower tower : towers) {
                if (tower.size() != 0) {
                    if (tower.topDiskSize() == 1) {
                        moveDisk(tower);
                        break;
                    }
                }
            }
            if (getMovableDisk() != null) {
                moveDisk(getMovableDisk());
            }

        }
        // for (Disk tower : towers.get(2).disks.reversed()) {
        //     System.out.println(tower.size());
        // }
        // System.out.println("steps: " + i);
    }

    private void moveDisk(Tower currentTower) {
        System.out.println("");
        int towerIndex = towers.indexOf(currentTower);
        Disk poppedDisk = currentTower.popDisk();
        int targetTowerIndex;
        if ((poppedDisk.size() % 2) == 0) {
            targetTowerIndex = (towerIndex + 1) % 3;
        } else {
            targetTowerIndex = (towerIndex + 2) % 3;
        }
        Tower targetTower = towers.get(targetTowerIndex);
        System.out.print("Step: " + (++i) + "  From: " + (towerIndex + 1) + " To: " + (targetTowerIndex + 1));
        targetTower.pushDisk(poppedDisk);
        // i++;
    }

    private Tower getMovableDisk() {
        for (Tower tower : towers) {
            if (tower.size() != 0) {
                if ((tower.topDiskSize() != 1)) {
                    boolean flag = true;
                    for (Tower tower2 : towers) {
                        if (tower2.size() != 0) {
                            if ((tower2.topDiskSize() != 1) && (tower2.topDiskSize() < tower.topDiskSize())) {
                                flag = false;
                            }
                        }
                    }
                    if (flag) {
                        return tower;
                    }
                }
            }
        }
        return null;
    }
}