package org.example.before;

public class ClientBefore {
    public static void main(String[] args) {
        ReaderBefore reader = new ReaderBefore();
        reader.setDirectory("D:/Projetos/Backend/SOLID/OCP/arquivos");
        reader.setFile("dados.csv");
//        reader.setFile("dados.txt");

        reader.readFile();
    }
}
