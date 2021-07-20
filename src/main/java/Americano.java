public class Americano extends Coffee {
    Americano(String name, boolean isIced) {
        super(name, isIced);
    }

    @Override
    public void putIngredients() {
        super.putWater();
        super.putIngredients();
    }

}
