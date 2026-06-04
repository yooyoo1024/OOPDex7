package part1;

public class StatisticsVisitor implements Visitor {

    private String stats = "";

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
            "/nDirectory %s has %i files",
            d.getName(),
            fileCount
        );
    }
}
