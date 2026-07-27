//package classesFileHandling;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//
//public class FileHandlingByteArrayDemo {
//    public static void main(String[] args) throws IOException {
//
//        InputStream readfile = null;
//        int content = 0;
//        byte store[] = new byte[50];
//        try{
//            readfile = new FileInputStream("D:\\Downloads\\details.txt");
//            content = readfile.read(store);
//            System.out.println("File contents in array : ");
//            for (int i = 0; i < store.length; i++){
//                System.out.print((char)store[i] );
//            }
//            System.out.println("Number of bytes read from the file : "+content);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            readfile.close();
//        }
//    }
//}


package classesFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileHandlingByteArrayDemo {

    public static void main(String[] args) {

        InputStream readfile = null;
        byte[] store = new byte[50];
        int content = 0;

        try {
            // Open the file
            readfile = new FileInputStream("D:\\Downloads\\details.txt");

            // Read bytes into the array
            content = readfile.read(store);

            // Convert bytes to String using UTF-8
            String text = new String(store, 0, content, StandardCharsets.UTF_8);

            // Display file contents
            System.out.println("File contents:");
            System.out.println(text);

            // Display number of bytes read
            System.out.println("Number of bytes read from the file: " + content);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Error while reading the file!");
            e.printStackTrace();

        } finally {
            try {
                if (readfile != null) {
                    readfile.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}