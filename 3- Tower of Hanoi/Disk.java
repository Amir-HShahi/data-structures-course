public class Disk implements Comparable<Disk> {
    final private int size;

    public Disk(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            this.size = 0;
        }
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Disk o) {
        if (this.size > o.getSize()) {
            return 1;
        } else if (this.size < o.getSize()) {
            return -1;
        } else {
            return 0;
        }
    }

}
