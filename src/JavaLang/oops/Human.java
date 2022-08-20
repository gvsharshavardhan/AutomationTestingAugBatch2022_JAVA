package JavaLang.oops;

public class Human {

    //var //attributes
    private String name = "john";
    private int weight = 50;
    private int bankBalance;

    //constructor
    public Human(String name,int weight){
        this.name = name;
        this.weight = weight;
    }

    public Human(int bankBalance){
        this.bankBalance = bankBalance;
    }

    public Human(){

    }

    public int getBankBalance(String uname, String password) {
        if(uname.equals("busyqa") && password.equals("pass")) {
            return bankBalance;
        }
        else{
            return -1;
        }
    }

    //set the value to name attr
    public void setName(String name){
        this.name = name;
    }

    //get the value of name attr
    public String getName(){
        return this.name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return this.weight;
    }

    //methods //behaviours
    private void talk(){
        System.out.println(this.name);
        System.out.println("walking!!");
    }
}