package org.example.after.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileCSVAfter extends FileAfter{

    public FileCSVAfter(String file) {
        super(file);
    }

    @Override
    public List<Map<String, String>> readFile(String path) {
        try (BufferedReader buffer = Files.newBufferedReader(Paths.get(path), StandardCharsets.ISO_8859_1)) {
            String line;
            while ((line = buffer.readLine()) != null) {
                data.add(parseLineCSV(line));
            }
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<String, String> parseLineCSV(String line) {
        Map<String, String> mapCells = new HashMap<>();
        String[] lineArray = line.split(";");
        mapCells.put("name", lineArray[0]);
        mapCells.put("cpf", lineArray[1]);
        mapCells.put("email", lineArray[2]);

        return mapCells;
    }
}
