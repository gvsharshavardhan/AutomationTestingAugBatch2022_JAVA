package JavaLang.oops.abstraction;

public class SonyDemo {
    public static void main(String[] args) {

        Sony s = new SonyMax();
        s.channel();
        s.volume();
        ((SonyMax)s).bluetooth();
    }
}
