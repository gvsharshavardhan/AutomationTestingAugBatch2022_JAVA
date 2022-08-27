package JavaLang.collections;

import java.util.HashMap;
import java.util.Scanner;

public class MapExamples {
    public static void main(String[] args) {

        //"harsha vardhan"
        //h - 3
        //a - 4
        //r - 2
        //s - 1
        //v - 1
        //d - 1
        //n - 1

        //0. create a map with key as char, value as int
        HashMap<Character, Integer> count = new HashMap<>();

        //1. get the string from the user // abcd
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.nextLine();

        //2. convert str to charArray ['a','b','c','d']
        char[] ca = str.toCharArray();

        //3. loop over char array
        for(char ch :ca){
            if(count.containsKey(ch)){
                int c = count.get(ch) + 1;
                count.put(ch,c);
            }else{
                count.put(ch,1);
            }
        }

        System.out.println(count);

    }
}
