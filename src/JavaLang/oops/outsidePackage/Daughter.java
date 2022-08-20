package JavaLang.oops.outsidePackage;

import JavaLang.oops.accessModifiers.Father;

public class Daughter extends Father {

    public void run(){
        System.out.println("daughter run!");
        doBusiness();
        walk();
    }

}
