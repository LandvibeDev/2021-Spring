package Cafe;

public class IceTea extends Drink{
    IceTea(String n, boolean ice) {
        super(n, ice);
    }
    void putIcetea(){
        System.out.println("- 아이스티 분말을 넣는다.\r");
    }
    @Override
    void putIngredients() {
        super.putWater();
        putIcetea();
        super.putIngredients();
    }
}
