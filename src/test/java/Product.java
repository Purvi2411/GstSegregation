public abstract class Product{
    public boolean isEligibleForGst;
    public int amount;
    public int gstAmount;

    public Product(boolean isEligibleForGst, int amount) {
        this.isEligibleForGst = isEligibleForGst;
        this.amount = amount;
    }

    public Product(boolean isEligibleForGst, int amount,int gstAmount) {
        this.isEligibleForGst = isEligibleForGst;
        this.amount = amount;
        this.gstAmount=gstAmount;
    }

//    public abstract int totalPriceOfProduct();

    public int totalPriceOfProduct(){
        return amount;
    }
}