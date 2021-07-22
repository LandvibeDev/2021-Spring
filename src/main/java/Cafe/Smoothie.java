package Cafe;

public class Smoothie extends Drink{
    Smoothie(String n, boolean ice) {
        super(n, ice);
    }
    void mix(){
        System.out.println("- 믹서기를 이용해 섞는다.");
    }
    @Override
    void putIngredients() {
        super.putMilk();
        super.putIngredients();
        mix();
    }
}
