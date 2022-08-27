package JavaLang.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(12);
        ll.add(true);
        ll.add("busyqa");
        ll.add(new Student("harsha",122));
        System.out.println(ll);
        System.out.println(ll.get(2));

        List l = new LinkedList();
         l = new ArrayList();


        //stack -> lIFo
        //queue -> FiFo

    }
}
