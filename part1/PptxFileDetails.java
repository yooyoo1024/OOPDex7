package part1;

public class PptxFileDetails extends PrimitiveFileDetails {

    private int slides;

    public PptxFileDetails(String path, String fileName, int slides, int size) {
        super(path, fileName, size);
        this.slides = slides;
    }

    public int getSlides() {
        return slides;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
