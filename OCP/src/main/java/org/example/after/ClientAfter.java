package org.example.after;

import org.example.after.file.FileCSVAfter;
import org.example.after.file.FileTxtAfter;
import org.example.after.reader.ReaderAfter;

public class ClientAfter {
    public static void main(String[] args) {
        ReaderAfter reader = new ReaderAfter();
        reader.setDirectory("D:/Projetos/Backend/SOLID/OCP/arquivos");

        reader.readFile(new FileCSVAfter("dados.csv"));
        System.out.println();
        reader.readFile(new FileTxtAfter("dados.txt"));
    }
}
