package JavaLang.oops;

public class Car {

    //attr //nouns //fields(or)variables
    String name;
    String color;
    String capacity;//7 seater
    int age;

    //init instance variables
    Car(String zname, String zcolor, String zcapacity) {
        name = zname;
        color = zcolor;
        capacity = zcapacity;
    }

    Car() {

    }

    Car(String zname) {
        name = zname;
    }


    //beh //verbs //methods
    void start() {
        System.out.println("starting the car!");
    }

    void stop() {
        System.out.println("stopping the car!");
    }

    void accelerate() {
        System.out.println("accelerating the car!");
    }

    void accelerate(int a) {
        System.out.println("capacity " + a);
    }
}