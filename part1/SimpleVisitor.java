package part1;

public interface SimpleVisitor extends Visitor {
    void visitPrimitive(PrimitiveFileDetails d);

    @Override
    default void visit(DocxFileDetails d) {
        visitPrimitive(d);
    }

    @Override
    default void visit(HtmlFileDetails d) {
        visitPrimitive(d);
    }

    @Override
    default void visit(JpgFileDetails d) {
        visitPrimitive(d);
    }

    @Override
    default void visit(Mp3FileDetails d) {
        visitPrimitive(d);
    }

    @Override
    default void visit(PptxFileDetails d) {
        visitPrimitive(d);
    }

    @Override
    default void visit(TxtFileDetails d) {
        visitPrimitive(d);
    }
}
