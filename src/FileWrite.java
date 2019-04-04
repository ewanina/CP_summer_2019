import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {
        String OUT_PATH = "C:\\Users\\nl72246\\Desktop\\MyFile";
        File outFile = new File(OUT_PATH);

        boolean append;

        try {

            //Overwrite existing file or append to it
            FileWriter fw = new FileWriter(outFile, append:true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Header of my file");
            bw.newLine();
            bw.write("23;23;23123");
            bw.newLine();
            // position in the ASCII table
            bw.write(65);
            bw.flush();
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
