package JavaLang.oops.abstraction;

public class SonyPro implements Sony{
    @Override
    public void volume() {
        System.out.println("50volume");
    }

    @Override
    public void channel() {
        System.out.println("50 channels");
    }

    public void wifi(){
        System.out.println("wifi");
    }
}
