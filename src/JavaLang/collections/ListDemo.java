package JavaLang.collections;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {

        Student s1 = new Student("abcd", 101);
        Student s2 = new Student("xyz", 102);

        ArrayList names = new ArrayList();

        names.add(10);
        names.add(20);
        names.add(12.34);
        names.add("abc");
        names.add('@');
        names.add(true);
        names.add(s1);
        names.add(s2);
        names.add(null);


        System.out.println(names);

//        boolean b = (boolean) names.get(5);
        System.out.println(names.get(5));

        System.out.println(names.get(7));
        names.add(3,"lmn");
        System.out.println(names);

        ArrayList colors = new ArrayList();
        colors.add("red");
        colors.add("white");

        names.addAll(colors);
        System.out.println(names);

        ArrayList colors2;
        colors2 = (ArrayList) colors.clone();
        colors2.remove(0);
        System.out.println(colors2);
        System.out.println(colors);
        colors.add("red");
        System.out.println(colors);

        System.out.println(colors.indexOf("red"));
        String col = (String)colors.set(0,"green");//replace
        System.out.println(colors);
        System.out.println(col);



    }
}
