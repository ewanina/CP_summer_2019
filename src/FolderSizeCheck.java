import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FolderSizeCheck {

    private static long sumSize(File file) {
        if (file.isFile()) return file.length();
        else {
            File[] files = file.listFiles();
            long sum = 0;
            for (File f : files) {
                sum += sumSize(f);
                //System.out.println(f.length());
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        File newFile = new File("C:\\Users\\nl72246\\Desktop\\MyFile");


        System.out.println(sumSize(newFile));
    }

}

/*
    public static void main(String[] args) {
        File newFile = new File("C:\\Users\\nl72246\\Desktop\\MyFile");



        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            for (File f : files) {
                System.out.println(f.length());
            }
        }

    }
}
*/

/*    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\nl72246\\Desktop\\MyFile";
        File file = new File(path);

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {

        }

        System.out.println();

    }
}
*/
