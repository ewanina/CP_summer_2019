import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "myfile.txt";
        File file = new File(path);

        String temp = System.getenv( "TEMP");
        System.out.println(temp);

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        //file.


    }
}
