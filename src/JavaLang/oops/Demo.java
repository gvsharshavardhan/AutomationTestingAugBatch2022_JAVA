package JavaLang.oops;

public class Demo {

    public static void main(String[] args) {
        Car c = new Car();

        System.out.println(c.capacity);

        Car c2 = new Car("tesla", "red","7 seater");
        System.out.println(c2.capacity);

        Car c3 = new Car("toyota");
        System.out.println(c3.name);
        System.out.println(c3.capacity);
        c3.accelerate();
        c3.accelerate(45);


    }


}