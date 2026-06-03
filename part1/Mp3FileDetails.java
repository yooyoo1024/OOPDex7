package part1;

public class Mp3FileDetails extends PrimitiveFileDitails {

    private int lengthSec;

    public Mp3FileDetails(
        String path,
        String fileName,
        int lengthSec,
        int size
    ) {
        super(path, fileName, size);
        this.lengthSec = lengthSec;
    }

    public int getLengthSec() {
        return lengthSec;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
