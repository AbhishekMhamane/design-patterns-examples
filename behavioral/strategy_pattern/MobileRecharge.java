package behavioral.strategy_pattern;
public class MobileRecharge {
  
    private String planId;
    private long validity;
    private long mobileNo;
    private int cost;

    // pays the cost for mobile recharge
    public void payForRecharge(PaymentStrategy paymentStrategy) {
        int amount = this.cost;
        System.out.println("Payment is processing for recharge on mobile number " + this.mobileNo 
        +" with cost " + amount);
        paymentStrategy.pay(amount);
    }

    public String getPlanId() {
        return planId;
    }
    public void setPlanId(String planId) {
        this.planId = planId;
    }
    public long getValidity() {
        return validity;
    }
    public void setValidity(long validity) {
        this.validity = validity;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    

}
