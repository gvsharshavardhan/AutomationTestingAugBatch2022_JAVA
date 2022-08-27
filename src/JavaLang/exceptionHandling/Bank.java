package JavaLang.exceptionHandling;

public class Bank {
    private int amt;
    private String uname;
    private String password;

    public Bank(int amt, String uname, String password) {
        this.amt = amt;
        this.uname = uname;
        this.password = password;
    }

    public void depositeAmt(int amt, String uname, String password) {
        if (this.uname.equals(uname) && this.password.equals(password)) {
            this.amt = this.amt + amt;
        } else {
            throw new InvalidCredentialsException("Credntials are invalid!!!");
        }
    }

    public void withDrawAmt(int amt, String uname, String password) {
        if (this.uname.equals(uname) && this.password.equals(password)) {
            if (this.amt < amt) {
                throw new OutOfBalanceException("witrhdrawing requested amt is not possible!");
            } else {
                System.out.println(amt + " has been withdraw");
                this.amt = this.amt - amt;
            }
        } else {
            throw new InvalidCredentialsException("Credntials are invalid!!!");
        }
    }

    public void testThrow() {
        throw new ArithmeticException("sin 2 cos 2 !!");
    }

}
