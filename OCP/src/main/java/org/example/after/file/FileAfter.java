package org.example.after.file;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class FileAfter {
    protected List<Map<String, String>> data = new ArrayList<>();
    protected String file;
    protected FileAfter (String file) {
        this.file = file;
    }
    public String getFile() {
        return file;
    }
    public abstract List<Map<String, String>> readFile(String path);
}
