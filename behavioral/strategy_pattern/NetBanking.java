package behavioral.strategy_pattern;

public class NetBanking implements PaymentStrategy{

    private String username;
    private String password;
    
    @Override
    public void pay(int amount) {
        System.out.println("Paying through NetBanking for " + amount + " amount is completed successfully..");
    }
    
}
