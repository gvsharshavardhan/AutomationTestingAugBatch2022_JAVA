package JavaLang.strings;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("harsha");
        String str2 = new String("harsha");
        String str3 = "harsha";
        String str4 = "harsha";

        System.out.println(str1==str2); //z,b-f, a-t, y-t
        System.out.println(str1==str3); //f
        System.out.println(str3==str2); //f
        System.out.println(str3==str4); //t
        System.out.println(str3.equals(str2));//t


    }
}
