public class Vegetables extends Product{

    public boolean areFresh;
    public String vegetableName;
    String expiryDate;
    String color;

    public Vegetables(boolean isEligibleForGst, int amount, boolean areFresh,String vegetableName) {
        super(isEligibleForGst, amount);
        this.areFresh=areFresh;
        this.vegetableName=vegetableName;
    }

    public int totalPriceOfProduct(){
        return amount;
    }
}
