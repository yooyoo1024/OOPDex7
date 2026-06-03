package part1;

public class JpgFileDetails extends PrimitiveFileDitails {

    private int width;
    private int height;

    public JpgFileDetails(
        String path,
        String fileName,
        int width,
        int height,
        int size
    ) {
        super(path, fileName, size);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
