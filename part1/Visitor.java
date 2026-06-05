package part1;

public interface Visitor {
    default void visit(DirectoryDetails d){
        for (var f : d.getFiles()) {
            f.accept(this);
        }
    }

    void visit(DocxFileDetails d);
    void visit(HtmlFileDetails d);
    void visit(JpgFileDetails d);
    void visit(Mp3FileDetails d);
    void visit(PptxFileDetails d);
    void visit(TxtFileDetails d);
}
