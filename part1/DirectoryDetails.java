package part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {

    private final List<FileDetails> files = new ArrayList<>();

    public DirectoryDetails(String path, String name) {
        super(path, name);
    }

    public void addFile(FileDetails fileDetails) {
        files.add(fileDetails);
    }

    //returns a read-only view to the directory's files
    public Collection<FileDetails> getFiles() {
        return Collections.unmodifiableCollection(files);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
