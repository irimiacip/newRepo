package FILES;

import java.io.*;

public class FisierText1 {

    public static void createFile() throws IOException {
        File fisierText = new File("C:\\TestGenerateFiles\\textFile.txt");
        try {
            if (fisierText.createNewFile()) {
                System.out.println("fiserul text a fost creat cu numele " + fisierText.getName());
            } else {
                System.out.println("Fisierul exista");
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare := " + e.getMessage());
        }
    }

    public static void writeFileMultiLine() throws IOException {
        FileWriter writeFisierText = new FileWriter("C:\\TestGenerateFiles\\textFile.txt");
        writeFisierText.write("First line write in file \r\n");
        writeFisierText.write("Second line write in file");
        writeFisierText.close();
    }

    public static void writeFileAppendMod() throws IOException {
        FileWriter writeFisierTextAppend = new FileWriter("C:\\TestGenerateFiles\\textFile.txt", true);
        writeFisierTextAppend.write("\r\nAppend First line write in file \r\n");
        writeFisierTextAppend.write("Append Second line write in file");
        writeFisierTextAppend.close();
    }

    public static void readFile() throws IOException {
        FileReader readFile = new FileReader("C:\\TestGenerateFiles\\textFile.txt");
        //readFile.read();
        // CITIRE VARIABILA IN LOOP CU REINITIALIZARE PENTRU FIECARE PARCURGERE !!!!!
        int i;
        // Holds true till there is nothing to read
        while ((i = readFile.read()) != -1)
            // Print all the content of a file
            System.out.print((char) i);
    }

    public static void main(String args[]) throws IOException {
        createFile();
        writeFileMultiLine();
        writeFileAppendMod();
        readFile();
    }
}
