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
        stats += String.format(
            "\nThe file %s has an average of %i words per page.",
            d.getName(),
            Math.round(d.getWords() / (float) d.getPages())
        );
    }

    @Override
    public void visit(HtmlFileDetails d) {
        stats += String.format(
            "\nThe file %s contains %i lines.",
            d.getName(),
            d.getLines()
        );
    }

    @Override
    public void visit(JpgFileDetails d) {
        stats += String.format(
            "\nThe picture %s has an average of %i bytes per pixel.",
            d.getName(),
            Math.round(d.getSize() / (float) (d.getWidth() * d.getHeight()))
        );
    }

    @Override
    public void visit(Mp3FileDetails d) {
        stats += String.format(
            "\nThe bitrate of %s is %i bytes per second.",
            d.getName(),
            Math.round(d.getSize() / (float) d.getLengthSec())
        );
    }

    @Override
    public void visit(PptxFileDetails d) {
        stats += String.format(
            "\nThe average slide size in %s is %i.",
            d.getName(),
            Math.round(d.getSize() / (float) d.getSlides())
        );
    }

    @Override
    public void visit(TxtFileDetails d) {
        stats += String.format(
            "\nThe file %s contains %i words.",
            d.getName(),
            d.getWords()
        );
    }
}
