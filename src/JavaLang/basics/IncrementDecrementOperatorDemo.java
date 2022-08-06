package JavaLang.basics;

public class IncrementDecrementOperatorDemo {

    public static void main(String[] args) {
        // ++, --

        /**
         ++ - increment operator
         -- - decrement operator
         uni operators - one operand
         **/

//        int x = 7;
//        System.out.println(x);//1
//        x--; //x = x - 1
//        System.out.println(x);//2

/**
 int x = 10;
 int y = x++; //++x -> pre increment, x++ -> post increment
 System.out.println(x); //11
 System.out.println(y); //10
 **/

        int a = 10;
        int b = a++;
        int c = --b;
        int d = ++a;
        int e = c--;
        int f = d + e;

        System.out.println(a); //z,b- 12, j-11
        System.out.println(b); //z,b-9, j-10
        System.out.println(c); //z,b, j-8,
        System.out.println(d); //z,b,j-12,
        System.out.println(e); //z,b,j-9,
        System.out.println(f); //z,b,j-21,
    }
}
