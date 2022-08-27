package JavaLang.collections;

import java.util.ArrayList;
import java.util.List;

public class ListGenericExmaple {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(18);
        l.add(16);
        l.add(15);

        for(Integer i :l){
            System.out.println(i);
        }
    }
}
