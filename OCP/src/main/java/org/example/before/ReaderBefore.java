package org.example.before;

import java.util.List;
import java.util.Map;

public class ReaderBefore {
    private String directory;
    private String file;

    public ReaderBefore() {
    }
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void readFile() {
        String type;

        if (file.split("\\.")[1].equals("csv")) {
            type = "csv";
        } else {
            type = "txt";
        }

        FileBefore fileService = new FileBefore();
        List<Map<String, String>> fileData = fileService.readFile(directory + "/" + this.file, type);
        fileData.forEach(System.out::println);
    }
}
