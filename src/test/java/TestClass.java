import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void getCountOfAllEligibleProductsForGst(){
        Store store=new Store();
        Television lgTelevision=new Television(true,2000,18,"LG");
        Television daikinTelevision=new Television(true,1800,18,"Daikin");
        Vegetables radishVegetable=new Vegetables(false,10,true,"Radish");
        Vegetables carrotVegetable=new Vegetables(false,20,true,"Carrot");
        Clothes pants=new Clothes(true,500,5,"Levis","pants","jeans");
        store.addProductToStore(lgTelevision,daikinTelevision,radishVegetable,carrotVegetable,pants);
        int count= store.getCountOfProductsEligibleForGst();
        Assert.assertEquals(count,3);
    }

    @Test
    public void getAllEligibleProductsForPriceGreaterThanValue(){
        Store store=new Store();
        Television lgTelevision=new Television(true,2000,18,"LG");
        Television daikinTelevision=new Television(true,1800,18,"Daikin");
        Vegetables radishVegetable=new Vegetables(false,10,true,"Radish");
        Vegetables carrotVegetable=new Vegetables(false,20,true,"Carrot");
        Clothes pants=new Clothes(true,500,5,"Levis","pants","jeans");
        store.addProductToStore(lgTelevision,daikinTelevision,radishVegetable,carrotVegetable,pants);
        Assert.assertEquals(store.getCountOfItemsGreaterThanValue(2000),2);
    }
}
