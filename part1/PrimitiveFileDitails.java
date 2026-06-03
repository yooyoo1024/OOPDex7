package part1;

public abstract class PrimitiveFileDitails extends FileDetails {

    final int size;

    public PrimitiveFileDitails(String path, String fileName, int size) {
        super(path, fileName);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
