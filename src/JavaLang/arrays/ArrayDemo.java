package JavaLang.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        int i[] = {10,20,30,40, 50,60};
//        System.out.println(i[0]);

        String j[] = new String[6]; //0 -> 4
        j[0] = "Akshaya";
        j[1] = "Angelica";
        j[2] = "Bharati";
        j[3] = "Juan";
        j[4] = "Jyothi";
        j[5] = "Zeenat";
        System.out.println(j.length);

        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }

    }
}
