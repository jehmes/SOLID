package org.example.after.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileTxtAfter extends FileAfter {
    public FileTxtAfter(String file) {
        super(file);
    }

    @Override
    public List<Map<String, String>> readFile(String path) {
        try (BufferedReader buffer = Files.newBufferedReader(Paths.get(path), StandardCharsets.ISO_8859_1)) {
            String line;
            while ((line = buffer.readLine()) != null) {
                data.add(parseLineTxt(line));
            }
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<String, String> parseLineTxt(String line) {
        Map<String, String> mapCells = new HashMap<>();
        mapCells.put("name", line.substring(11, 40).trim());
        mapCells.put("cpf", line.substring(0, 11));
        mapCells.put("email", line.substring(41));
        return mapCells;
    }
}
