package part1;

public class StatisticsVisitor implements Visitor {

    private String stats = "";

    private StatisticsVisitor() {}

    public static String getStats(FileDetails root) {
        StatisticsVisitor v = new StatisticsVisitor();
        root.accept(v);
        return v.stats;
    }

    @Override
    public void visit(DirectoryDetails d) {
        int fileCount = 0;
        for (var f : d.getFiles()) {
            f.accept(this);
            ++fileCount;
        }
        stats += String.format(
            "\nDirectory %s has %i files",
            d.getName(),
            fileCount
        );
    }

    @Override
    public void visit(DocxFileDetails d) {
        // The file word.docx has an average of 343 words per page.

        
    }

    @Override
    public void visit(HtmlFileDetails d) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(JpgFileDetails d) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(Mp3FileDetails d) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(PptxFileDetails d) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(TxtFileDetails d) {
        // TODO Auto-generated method stub
        
    }

    
}
