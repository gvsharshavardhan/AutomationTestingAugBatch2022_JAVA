package JavaLang.superdemo;


public class SonyPro extends Sony {
    public SonyPro(int volume) {
        super(volume, 50);
    }

    public void volume(){
        System.out.println(volume + "overridden volume");
    }

    public void wifi(){
        super.volume();
    }

}