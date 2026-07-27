package classesFileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileHandlingWriteBytesDemo {
    public static void main(String[] args) {
        OutputStream writefile = null;
        String contents = "Coder Technologies, Vashi Railway Station Complex, Vashi";
        byte writearray[] = new byte[500];

        try{
            writefile = new FileOutputStream("D:\\Downloads\\details.txt");
            writearray = contents.getBytes();
            writefile.write(writearray);
//            writefile.write(writearray, 4, 50);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}