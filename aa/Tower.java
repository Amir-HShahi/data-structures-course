import java.util.ArrayList;

public class Tower {
    private ArrayList<Disk> disks = new ArrayList<Disk>();

    public Tower() {
        disks.add(new Disk(100));
    }

    public Boolean pushDisk(Disk disk) {
        if (disks.isEmpty()) {
            disks.add(disk);
            return true;
        }
        if ((disks.getLast().compareTo(disk) > 0)) {
            disks.add(disk);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String tower = "";
        for (int i = 1; i < disks.size(); i++) {
            tower += disks.get(i).size() + ",";
        }
        return tower;
    }

    public Disk popDisk() {
        return disks.removeLast();
    }

    public int size() {
        return disks.size();
    }

    public int topDiskSize() {
        return disks.
        getLast().
        size();
    }

}
