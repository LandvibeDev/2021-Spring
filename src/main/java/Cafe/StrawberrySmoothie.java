package Cafe;

public class StrawberrySmoothie extends Smoothie{
    StrawberrySmoothie(String n, boolean ice) {
        super(n, ice);
    }
    void putStrawberry(){
        System.out.println("- 딸기를 넣는다.\r");
    }
    @Override
    void putIngredients() {
        putStrawberry();
        super.putIngredients();
    }
}
