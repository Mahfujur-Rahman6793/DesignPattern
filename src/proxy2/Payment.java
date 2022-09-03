package proxy2;

public interface Payment {
    public void pay(String accountno);
}
class Bank implements Payment{

    @Override
    public void pay(String accountno) {
        System.out.println("Processing...." +accountno);
    }
}
class CreditCard implements Payment{
    private Payment bankAccount;
    public CreditCard(){
        bankAccount = new Bank();
    }


    @Override
    public void pay(String accountno) {
        if (accountno.equals("11221122")){
            System.out.println("Payment okkkk.....");
        }
        else{
            System.out.println("Sorry, not possible ");
        }

    }
}
