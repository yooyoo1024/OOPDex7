package part1;

public class SizeVisitor implements SimpleVisitor {

    // static method to count the total number of bytes in a directory tree
    public static int calcSize(FileDetails root) {
        SizeVisitor v = new SizeVisitor();
        root.accept(v);
        return v.size;
    }

    private int size = 0;

    // private constructor to prevent instantiation from outside the class
    private SizeVisitor() {}

    @Override
    public void visitPrimitive(PrimitiveFileDetails d) {
        size += d.getSize();
    }
}
