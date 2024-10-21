import java.util.ArrayList;

public class HanoiTower {
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
            
        }
    }

    private void moveDisk(int towerIndex) {
        
    }
}