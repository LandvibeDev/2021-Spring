package Cafe;

public class CaffeLatte extends Coffee{
    CaffeLatte(String n, boolean ice) {
        super(n, ice);
    }
    @Override
    void putIngredients() {
        super.putMilk();
        super.putIngredients();
    }
}
