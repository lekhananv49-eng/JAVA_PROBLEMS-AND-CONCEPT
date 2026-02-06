package DAY5.Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywords {
    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("sample.txt");
        System.out.println("File opened success");
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
