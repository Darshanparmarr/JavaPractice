package classesFileHandling;

import java.io.*;

public class FileHandlingReadWriteBytesDemo {
    public static void main(String[] args) throws IOException {
        OutputStream writefile = null;
        InputStream readfile = null;
        int content = 0;
        try{
            readfile = new FileInputStream("D:\\Downloads\\song.txt");
            writefile = new FileOutputStream("D:\\Downloads\\details.txt");

            while (content != -1){
                content = readfile.read();
                if (content == -1){
                    break;
                }
                writefile.write(content);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            readfile.close();
            writefile.close();
        }
    }
}
