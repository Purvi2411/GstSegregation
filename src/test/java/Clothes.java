public class Clothes extends Product{

    public String brandName;
    public String clothType;
    public String clothMaterial;

    public Clothes(boolean isEligibleForGst, int amount, int gstAmount,String brandName, String clothType, String clothMaterial) {
        super(isEligibleForGst, amount,gstAmount);
        this.brandName = brandName;
        this.clothType = clothType;
        this.clothMaterial = clothMaterial;
    }

    public int totalPriceOfProduct(){
        return amount;
    }
}
