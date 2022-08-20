package JavaLang.loops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows = sc.nextInt(); //2

        /*
        *
        *#
        *#*
        *#*#
        *#*#*
         */

        for (int i = 1; i <= rows; i++) { //2
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}