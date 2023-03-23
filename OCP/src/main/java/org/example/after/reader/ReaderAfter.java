package org.example.after.reader;

import org.example.after.file.FileAfter;

import java.util.List;
import java.util.Map;

public class ReaderAfter {
    private String directory;

    public ReaderAfter() {
    }
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void readFile(FileAfter fileAfter) {
        List<Map<String, String>> fileData = fileAfter.readFile(directory + "/" + fileAfter.getFile());
        fileData.forEach(System.out::println);
    }
}
