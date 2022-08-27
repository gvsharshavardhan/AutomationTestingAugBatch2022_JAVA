package JavaLang.exceptionHandling;

public class TestDemo {
    public static void main(String[] args) {

        Bank act1 = new Bank(1000, "harsha", "pass");
//        act1.withDrawAmt(500, "harsha","pass123");
        act1.testThrow();

    }

}