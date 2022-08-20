package JavaLang.oops.polymorphism;

import java.util.Scanner;

public class TvDemo {

    //when we access child object with parent
    //reference variable, then we can access parent
    //methods with child implementation alone, we cannot
    //access child specific methods.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter tv name: ");
        String tvName = sc.nextLine();

        Sony src = null;
        if (tvName.equals("pro")) {
            src = new SonyPro();
            ((SonyPro)src).wifi();

            //1000lines
        } else if (tvName.equals("max")) {

             src = new SonyMaX();
            //1000 lines from max
        }

        src.volume();
        src.channels();

        //sony src = new sonypro();
        //((sonypro)src).childspecificmethods
        //down casting
        //up casting is not possible


    }
}