package JavaLang.basics;

public class VariablesDemo {

    public static void main(String[] args) {

        int x = 2; //declaration and init
        int y;//declaration //one time activity
        y = 5;//initialization
        int z = x + y;

        System.out.println(z); //7

        y = 10;
        z = x + y;
        System.out.println(z); //12, 7
    }
}