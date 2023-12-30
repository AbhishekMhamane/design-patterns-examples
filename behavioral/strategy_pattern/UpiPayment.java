package behavioral.strategy_pattern;

public class UpiPayment implements PaymentStrategy{

    private String upiId;
    private String password;

    public UpiPayment(String upiId, String password){
        this.upiId = upiId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment through UpiPayment for " + amount + " amount is completed successfully..");
    }
    
}
