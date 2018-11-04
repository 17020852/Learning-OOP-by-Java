
package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * các lỗi về input và output file
 */
public class IOExcep {
     public static void readFile() throws IOException{
        BufferedReader in = null;
        try{
            in = new BufferedReader(new FileReader("test.txt"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}
