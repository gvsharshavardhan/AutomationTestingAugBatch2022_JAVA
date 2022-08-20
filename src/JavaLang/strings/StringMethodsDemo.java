package JavaLang.strings;

public class StringMethodsDemo {
    public static void main(String[] args) {
//        String str = "abc";
//        System.out.println(str);
//        str = str.concat("xyz");
//        System.out.println(str); //abcxyz //abc

//        StringBuffer sb = new StringBuffer("abc");
//        System.out.println(sb);
//        sb.append("xyz");
//        System.out.println(sb);

//        String name = "  abc xyz  ";
        //length()
        //equals()
        //charAt()
        //concat()
        //toUppercase()
        //toLowerCase()
        //trim()
//        System.out.println(name.length());
//        System.out.println(name);
//        name = name.trim();
//        System.out.println(name.length());
//        System.out.println(name);

        String a = "busyqa selenium java sessions";
//        String substr = a.substring(7, 15);
//        System.out.println(substr);

        String[] st = a.split("e");
        System.out.println(st.length); //4
        for (String s : st) {
            System.out.println(s);
        }
    }
}