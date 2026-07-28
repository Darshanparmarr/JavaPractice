package classesFileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileHandlingWriteCharDemo {

    public static void main(String[] args) throws IOException {
        OutputStreamWriter writerFile = null;
        try{
            writerFile = new FileWriter("D:\\Downloads\\abc.txt");
            String contents = "Learning Java";
            writerFile.write(contents);
            writerFile.write(contents, 3, 10);

            char contentarray[] = contents.toCharArray();
            writerFile.write(contentarray);
            writerFile.write(contentarray, 3,10);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            writerFile.close();
    }
    }
}