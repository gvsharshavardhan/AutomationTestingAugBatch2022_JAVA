package JavaLang.collections;

import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(12);
        hs.add(true);
        hs.add(new Student("abcd", 121));
        hs.add(12.34);
        hs.add(12);
        hs.add(null);
        hs.add(null);

        System.out.println(hs);
        int[] i = new int[2];
        System.out.println(i);

        Employee e1 = new Employee();
        System.out.println(e1);
        System.out.println(e1.hashCode());

    }
}