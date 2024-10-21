import java.util.HashMap;

public class HanoiTower {
    private int diskCount;
    HashMap<String, Tower> towers = new HashMap<String, Tower>();
    
    
    public HanoiTower(int diskCount) {
        this.diskCount = diskCount;
        towers.put("source", new Tower());
        for (int i = 3; i > 0; i--) {
            towers.get("source").pushDisk(new Disk(i));
        }
    }

    public void solve() {

    }

    private void moveDisk(int towerIndex) {

    }
}