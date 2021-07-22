package Cafe;

public class YogurtSmoothie extends Smoothie{
    YogurtSmoothie(String n, boolean ice) {
        super(n, ice);
    }
    void putYogurt(){
        System.out.println("- 요거트를 넣는다.\r");
    }
    @Override
    void putIngredients() {
        putYogurt();
        super.putIngredients();
    }
}
