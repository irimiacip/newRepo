package FILES;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FisierText2 {

public static void createFile() throws IOException {

    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of file");
        String name = "Steaua";
//        fara path adica doar (name,true) fisierul se genera in directorul proiectului, acelasi nivel cu pom.xml
        FileOutputStream fos = new FileOutputStream("C:\\TestGenerateFiles\\"+name, true);
        System.out.println("Enter file content");
        String str = "Lacatus"+"\r\n"+"Hagi";
        byte[] b = str.getBytes();       //converts string into bytes
        fos.write(b);           //writes bytes into file
        fos.close();            //close the file
        System.out.println("file saved.");
    }
    catch (IOException e) {
        System.out.println("Afiseaza text " + e.getMessage());
    }
}

    public static void main (String args []) throws IOException {
     createFile();
    }
}
