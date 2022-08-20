package JavaLang.methods;

import java.util.Scanner;

public class MethodDemo {
    static int b = 10; //global variable

    public static void main(String[] args) {
        //method calling
//        test();
//        test();
//        test();
//        test();
//        test();
//        int a = 3; //local variables
//        int c = 6;
//        testInput(c); //pass by value
//        System.out.println(b);
//        String name = testoutput();
//        System.out.println(name.split("r")[0]); //ha
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        boolean eligibility = isEligibleToVote(age);

        if(eligibility){
            System.out.println("please vote!");
        }else{
            System.out.println("come back once you are 20!");
        }

        if(eligibility){
            System.out.println("allowed!");
        }else{
            System.out.println("not allowed!");
        }
    }

    //i/p and o/p
    static boolean isEligibleToVote(int age){
        boolean flag;
        if(age>=20){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    //method declaration
    //no input no o/p
    static void test(){
        System.out.println("no input and output!!");
        System.out.println(b);
    }

    //input, no o/p
    static void testInput(int dummy){
        System.out.println(dummy * 10);
        System.out.println(b);
    }

    //no input, there is an o/p
    static String testoutput(){
        return "harsha";
    }
}