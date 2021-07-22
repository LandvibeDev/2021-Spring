package Cafe;

public class VanillaLatte extends CaffeLatte{
    VanillaLatte(String n, boolean ice) {
        super(n, ice);
    }
    void putSyrup(){
        System.out.println("- 바닐라 시럽을 넣는다.\r");
    }
    @Override
    void putIngredients() {
        super.putIngredients();
        putSyrup();
    }
}
