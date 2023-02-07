package exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.in;
import static java.lang.System.out;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
           in = new FileInputStream("src/exercise/input.txt");
           out = new FileOutputStream("src/exercise/output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
