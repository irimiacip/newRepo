package FILES;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FisierText3 {

    public static void createFile() throws IOException {
        Path path = Paths.get("C:\\TestGenerateFiles\\javaprogram.txt"); //creates Path instance
        try{
            Path p= Files.createFile(path);     //creates file at specified location
            System.out.println("File Created at Path: "+p);
            String textToBeWrite = "First Line"+"\r\n"+"Second Line";
            Files.write(p,textToBeWrite.getBytes());
        }catch (IOException e){
            System.out.println("nu s-a generat fisierul"+ e.getMessage());
        }
    }

    public static void main(String args[]) throws IOException {
createFile();
    }
}
