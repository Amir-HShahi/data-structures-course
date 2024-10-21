import java.util.ArrayList;

public class Tower {
    private ArrayList<Disk> disks = new ArrayList<Disk>();

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

    public Disk popDisk() {
        return disks.removeLast();
    }

    public int size() {
        return disks.size();
    }
}
