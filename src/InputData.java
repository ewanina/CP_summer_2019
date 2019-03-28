import java.util.Scanner;
import java.util.logging.Logger;

public class InputData {

    private static final String MYCONST_A = "abc";
    private static final String MYCONST_B = "abc";
    private static final String MYCONST_C = "abc";



    public static void main(String[] args) {
        //MYCONST = "dgd";
        System.out.println(MYCONST_A);

        //Scanner scanner = new Scanner(System.in);

        System.err.println("Error");
        System.out.println("Output");

        //Logger log = Logger.getLogger("My Logger");
        //log.info(msg: "My Info");
        //log.fine( msg: "Fine");
        //log.warning( msg: "Warning");
        //In practice this logger is usually replaced

        //geting in

        System.out.println(MYCONST_A);

        System.out.println("What is my name");
        String name = "";
        Scanner scanner = new Scanner(System.in);
                while (!name.equals("exit") && scanner.hasNext())  {
                    name = scanner.next();
                    System.out.println(name);
                }


    }
}
