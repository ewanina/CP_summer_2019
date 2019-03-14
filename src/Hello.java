public class Hello {
    public static void main(String[] inputargs) { //void - no output variable
        System.out.println("Hello!!!");

        Integer a = 5;
        Integer b, c;
        b = a;
        c = b + 4;
        c = c - 4;

        if (b == a) System.out.println("b==a");
        if (b.equals(a)) System.out.println("b equals a");

        System.out.println("b=" + b);
        System.out.println("c=" + c);

        String s1 = "abc";
        String s2 = null;
        String s3 = s1.toUpperCase();

        System.out.println(s3.charAt(1));
        s1 = "Hello John";

        int j = s1.indexOf("Jo");
        System.out.println(j);



    }
}


