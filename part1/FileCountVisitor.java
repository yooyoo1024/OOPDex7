package part1;

public class FileCountVisitor implements SimpleVisitor {
    
    // static method to count the number of files in a directory tree
    public static int countFiles(FileDetails root) {
        FileCountVisitor counter = new FileCountVisitor(); 
        root.accept(counter);
        return counter.count;
    }

    private int count = 0;

    // private constructor to prevent instantiation from outside the class
    private FileCountVisitor() {
    }

    @Override
    public void visit(DirectoryDetails d) {
    }

    @Override
    public void visitPrimitive(PrimitiveFileDetails d) {
        count++;
    }
}
