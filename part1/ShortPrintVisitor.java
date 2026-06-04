package part1;

public class ShortPrintVisitor implements SimpleVisitor {

    String allNames = "";

    private ShortPrintVisitor() {}

    public static String getAllNames(FileDetails root) {
        var v = new ShortPrintVisitor();
        root.accept(v);

        return v.allNames;
    }

    @Override
    public void visit(DirectoryDetails d) {
        for (var f : d.getFiles()) {
            f.accept(this);
        }
        allNames += '\n' + d.getName();
    }

    @Override
    public void visitPrimitive(PrimitiveFileDetails d) {
        allNames += '\n' + d.getName();
    }
}
