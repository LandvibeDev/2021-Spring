package Cafe;

public class Americano extends Coffee{
    Americano(String n, boolean ice) {
        super(n, ice);
    }
    @Override
    void putIngredients() {
        super.putWater();
        super.putIngredients();
    }
}
