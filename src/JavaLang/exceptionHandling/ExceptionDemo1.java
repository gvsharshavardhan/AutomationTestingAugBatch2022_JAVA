package JavaLang.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo1 {
    public static void main(String[] args) {

//        int i = 10;
//        int j = 5;
//        int[] ar = new int[3];
//        ar[0] = 10;
//        ar[1] = 23;
//        ar[2] = 56;
//
//        //open db
//        try {
//            System.out.println(i / j);
//            System.out.println(ar[100]);//read db
//        } catch (Throwable ae) {
//            System.out.println(10/0);
//        }finally {
//            System.out.println("close the database");
//        }
        try {
            foo1();
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }


        try {
            foo2();
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        }

    }


    public static void foo1() {
        System.out.println(10 / 0);

    }

    public static void foo2() throws FileNotFoundException {

        FileReader fileReader = new FileReader("c://demo/demo.txt");
        System.out.println(10 / 0);

    }
}
