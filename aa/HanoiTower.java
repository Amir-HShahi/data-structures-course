public class HanoiTower {
    private int diskCount;
    private Tower src = new Tower();
    private Tower aux = new Tower();
    private Tower dest = new Tower();

    public HanoiTower(int diskCount) {
        this.diskCount = diskCount;
        for (int i = diskCount; i >= 1; i--)
            src.pushDisk(new Disk(i));
    }

    public void solve() {
        int i = 1;
        while (dest.size() != diskCount + 1) {
            if (i % 3 == 1)
                moveDisk(src, dest);

            else if (i % 3 == 2)
                moveDisk(src, aux);

            else if (i % 3 == 0)
                moveDisk(aux, dest);

            i++;
        }



        System.out.println("Steps: " + i);
        System.out.println("last tower:");
        System.out.println(src);
        System.out.println(aux);
        System.out.println(dest);
    }

    private void moveDisk(Tower src, Tower dest) {
        Disk srcDisk = src.popDisk();
        Disk destDisk = dest.popDisk();

        if (srcDisk.size() == 0) {
            src.pushDisk(destDisk);
        } else if (destDisk.size() == 0) {
            dest.pushDisk(srcDisk);
        } else if (srcDisk.size() > destDisk.size()) {
            src.pushDisk(srcDisk);
            src.pushDisk(destDisk);
        } else {
            dest.pushDisk(destDisk);
            dest.pushDisk(srcDisk);
        }

    }
}