public class Americano extends Coffee{
     Americano(String name, Boolean isIce) {
        super(name,isIce);
    }

    public void putIngreditnes(){
         super.putWater();
         super.putIngredients();
    }
}
