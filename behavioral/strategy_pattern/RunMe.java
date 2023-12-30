package behavioral.strategy_pattern;

public class RunMe {
    
    public static void main(String[] args) {
        
        MobileRecharge recharge = new MobileRecharge();
        recharge.setPlanId("1");
        recharge.setValidity(90);
        recharge.setMobileNo(123456789);
        recharge.setCost(799);

        // selecting mode of payment
        recharge.payForRecharge(new UpiPayment("123@upiid", "****"));

    }
}
