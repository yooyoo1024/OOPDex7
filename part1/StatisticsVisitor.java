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
            "\nDirectory %s has %d files",
            d.getName(),
            fileCount
        );
    }

    @Override
    public void visit(DocxFileDetails d) {
        stats += String.format(
            "\nThe file %s has an average of %d words per page.",
            d.getName(),
            Math.round(d.getWords() / (float) d.getPages())
        );
    }

    @Override
    public void visit(HtmlFileDetails d) {
        stats += String.format(
            "\nThe file %s contains %d lines.",
            d.getName(),
            d.getLines()
        );
    }

    @Override
    public void visit(JpgFileDetails d) {
        stats += String.format(
            "\nThe picture %s has an average of %d bytes per pixel.",
            d.getName(),
            Math.round(d.getSize() / (float) (d.getWidth() * d.getHeight()))
        );
    }

    @Override
    public void visit(Mp3FileDetails d) {
        stats += String.format(
            "\nThe bitrate of %s is %d bytes per second.",
            d.getName(),
            Math.round(d.getSize() / (float) d.getLengthSec())
        );
    }

    @Override
    public void visit(PptxFileDetails d) {
        stats += String.format(
            "\nThe average slide size in %s is %d.",
            d.getName(),
            Math.round(d.getSize() / (float) d.getSlides())
        );
    }

    @Override
    public void visit(TxtFileDetails d) {
        stats += String.format(
            "\nThe file %s contains %d words.",
            d.getName(),
            d.getWords()
        );
    }
}
