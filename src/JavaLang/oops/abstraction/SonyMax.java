package JavaLang.oops.abstraction;

public class SonyMax implements Sony{
    @Override
    public void volume() {
        System.out.println("70 volume");
    }

    @Override
    public void channel() {
        System.out.println("70 channels");
    }

    public void bluetooth(){
        System.out.println("bluetooth");
    }
}
