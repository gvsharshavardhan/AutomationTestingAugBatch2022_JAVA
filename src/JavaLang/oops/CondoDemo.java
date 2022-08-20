package JavaLang.oops;

public class CondoDemo {
    public static void main(String[] args) {
        Condo p1 = new Condo("king size");
        System.out.println(p1.bedroom); //king size
        System.out.println(p1.kitchen); //slfo

        Condo p2 = new Condo("queen size");
        System.out.println(p2.bedroom); //queen size
        System.out.println(p2.kitchen); //slfo

        p1.kitchen = "new stove, new light, new fride, new oven";
        System.out.println(p2.kitchen);
        System.out.println(p1.kitchen);

        p1.bedroom = "children bed room";
        System.out.println(p2.bedroom);//qs
        System.out.println(p1.bedroom);//c b r

        System.out.println(Condo.kitchen); //new stuff
    }
}
