package part1;

public class TxtFileDetails extends PrimitiveFileDetails {

    private int words;

    public TxtFileDetails(String path, String fileName, int words, int size) {
        super(path, fileName, size);
        this.words = words;
    }

    public int getWords() {
        return words;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
