package JavaLang.oops;

public class StaticExampleDemo {
    public static void main(String[] args) {
        StaticExample s1 = new StaticExample();
        System.out.println(s1.a);//2
        System.out.println(s1.b);//2
        StaticExample s2 = new StaticExample();
        System.out.println(s2.a);//3
        System.out.println(s2.b);//2 , 3
        StaticExample s3 = new StaticExample();
        System.out.println(s3.a);//4 ,
        System.out.println(s3.b);//2 , 4
        StaticExample.a++;
        System.out.println(s2.a);//5 , 6
        System.out.println(StaticExample.a);//5, 6

    }
}
