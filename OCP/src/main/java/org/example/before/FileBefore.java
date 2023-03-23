package org.example.before;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileBefore {
    private List<Map<String, String>> data = new ArrayList<>();

    public List<Map<String, String>> readFile(String path, String type) {
        try (BufferedReader buffer = Files.newBufferedReader(Paths.get(path), StandardCharsets.ISO_8859_1)) {
            String line;
            if (type.equals("csv")) {
                while ((line = buffer.readLine()) != null) {
                    data.add(parseLineCSV(line));
                }
            } else {
                while ((line = buffer.readLine()) != null) {
                    data.add(parseLineTxt(line));
                }
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

    private Map<String, String> parseLineTxt(String line) {
        Map<String, String> mapCells = new HashMap<>();
        mapCells.put("name", line.substring(11, 40).trim());
        mapCells.put("cpf", line.substring(0, 11));
        mapCells.put("email", line.substring(41));
        return mapCells;
    }
}
