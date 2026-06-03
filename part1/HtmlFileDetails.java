package part1;

public class HtmlFileDetails extends PrimitiveFileDitails {

    private int lines;

    public HtmlFileDetails(String path, String fileName, int lines, int size) {
        super(path, fileName, size);
        this.lines = lines;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
