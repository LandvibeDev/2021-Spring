package Cafe;

public class Coffee extends Drink{
    Coffee(String n, boolean ice) {
        super(n, ice);
    }
    void putEspresso() {
        System.out.println("- 에스프레소를 넣는다.\r");
    }
    @Override
    void putIngredients() {
        putEspresso();
        super.putIngredients();
    }
}
