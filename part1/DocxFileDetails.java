package part1;

public class DocxFileDetails extends PrimitiveFileDitails {

    private int words;
    private int pages;

    public DocxFileDetails(
        String path,
        String fileName,
        int words,
        int pages,
        int size
    ) {
        super(path, fileName, size);
        this.words = words;
        this.pages = pages;
    }

    public int getWords() {
        return words;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
