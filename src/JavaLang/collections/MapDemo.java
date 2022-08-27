package JavaLang.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();

//        HashMap hm = new HashMap();
//        hm.put(101,"abc");
//        hm.put(102,null);
//        hm.put(e1, null);
//        hm.put("xyz",12);
//        hm.put("xyz",12);
//        hm.put(true,new Student("roy",232));

        HashMap<String, Integer> marks = new HashMap();
        marks.put("abc", 12);
        marks.put("abcd", 412);
        marks.put("erc", 126);
        marks.put("pol", 182);

        //entryset -> returns entries as a set
        Set<Map.Entry<String, Integer>> es = marks.entrySet();
        System.out.println(es);

        //looping over set which contains entries , entry contains KEY:VALUE pairs
        for (Map.Entry<String, Integer> entry : es) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }

        System.out.println(marks.values());
        System.out.println(marks.keySet());


    }
}
