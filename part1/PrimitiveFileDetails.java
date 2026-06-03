package part1;

public abstract class PrimitiveFileDetails extends FileDetails {

    final int size;

    public PrimitiveFileDetails(String path, String fileName, int size) {
        super(path, fileName);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
