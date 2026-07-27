package classesFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

public class FileHandlingReadByByteDemo {

    public static void main(String[] args) throws IOException {
        InputStream readFile = null;
        int content = 0;

        try{
            readFile = new FileInputStream("D:\\Downloads\\details.txt");

            System.out.println("No. of bytes available to read : "+ readFile.available() + "\n");
            System.out.println("File contents");

            while ((content = readFile.read())!=-1){
                System.out.print((char) content);
            }

            System.out.println("\n\nNo. of bytes available to read : "+readFile.available());

        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        } finally {
            try{
                if(readFile != null){
                    readFile.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}