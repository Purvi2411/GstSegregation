public class Television extends Product{
//    int gstAmount;
    String manufacturingCompany;
    String monitorType;

    public Television(boolean isEligibleForGst, int amount, int gstAmount, String manufacturingCompany) {
        super(isEligibleForGst, amount,gstAmount);
//        this.gstAmount = gstAmount;
        this.manufacturingCompany = manufacturingCompany;
    }

    public int totalPriceOfProduct(){
        return amount+(amount * gstAmount/100);
    }
}
