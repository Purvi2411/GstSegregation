import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Store {

    public List<Product> product;
    String storeName;
    String storeManagerName;
    String storeAddress;

    public Store() {
        product=new ArrayList<>();
    }

    public void addProductToStore(Product... newProduct){
        for(Product pro:newProduct) {
            product.add(pro);
        }
    }

    public int getCountOfProductsEligibleForGst(){
        List<Product> listOfGstEligibleProducts=new ArrayList<>();
        for(Product pro:product){
            if(pro.isEligibleForGst==true){
                listOfGstEligibleProducts.add(pro);
            }
        }
        return listOfGstEligibleProducts.size();
    }

    public int getListOfProductsNotEligibleForGst(){
        List<Product> listOfNonGstEligibleProducts=new ArrayList<>();
        for(Product products:product){
            if(products.isEligibleForGst==false){
                listOfNonGstEligibleProducts.add(products);
            }
        }
        return listOfNonGstEligibleProducts.size();
    }

    public Set<String> getListOfProductsEligibleForGst(){
        Set<String> setOfGstEligibleProducts=new HashSet<>();
        for(Product pro:product){
            if(pro.isEligibleForGst==true){
                setOfGstEligibleProducts.add(pro.getClass().getName());
            }
        }
        return setOfGstEligibleProducts;
    }

    public int getCountOfItemsGreaterThanValue(int value){
        int count=0;
        for(Product products:product){
            if(products.totalPriceOfProduct()>value){
                count++;
            }
        }
        return count;
    }
}
