package JavaLang;

import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); // creating an obj for scanner
//        int input = sc.nextInt();
//
//        System.out.println(input + " is the popular language!!");

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            System.out.println("PLease enter your credentials");
            System.out.println("***************************************************");
            System.out.println("PLease enter your username:");
            String username = sc.nextLine();
            System.out.println("Please enter your password:");
            String password = sc.nextLine();
            if (username.equals("abcd") && password.equals("pass")) {
                System.out.println("Logged in!!");
                break;
            } else {
                System.out.println("invalid credentials!!");
                flag = true;
            }
        }while(flag);

    }
}
