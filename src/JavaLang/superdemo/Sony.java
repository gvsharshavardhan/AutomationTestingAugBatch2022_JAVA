package JavaLang.superdemo;

public class Sony {

    public int volume = 23;
    public int channel;

    public  Sony(int volume, int channel) {
        this.channel = channel;
        this.volume = volume;
    }

    public void volume() {
        System.out.println(this.volume + " volume");
    }

    public void channel() {
        System.out.println(this.channel + " channels");
    }

}