package JavaLang.exceptionHandling;

//if you want your expection to be checked -> extend Expection or Throwable classes
//if you want your exception to be unchecked -> extend RuntimeException
public class OutOfBalanceException extends RuntimeException{

    public OutOfBalanceException(String errorMessage){
        super(errorMessage);
    }
}
