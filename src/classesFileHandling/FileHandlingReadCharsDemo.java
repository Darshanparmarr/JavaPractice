package classesFileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingReadCharsDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader readFile = null;
        int i = 0;
        char store[] = new char[100];

        try{
            readFile = new FileReader("D:\\Downloads\\song.txt");
            System.out.println("File Contents : ");
            while(i!= -1){
                i = readFile.read();
                if(i==1)break;
                System.out.print((char)i);
            }
            readFile.close();
            readFile = new FileReader("D:\\Downloads\\song.txt");
            i = readFile.read(store);
            String s = new String(store);
            System.out.println("\n\nBuffer Contents : \n"+s);
            readFile.close();
            readFile = new FileReader("D:\\Downloads\\song.txt");
            System.out.println("\nBuffer Contents : ");
            for (int j = 3; j < 13; j++){
                System.out.print((char)store[j]);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            readFile.close();
        }
    }
}
