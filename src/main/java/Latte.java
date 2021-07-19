public class Latte extends Coffee{

    Latte(String name, boolean isIced) {
        super(name, isIced);
    }
    @Override
    public void putIngredients(){
        super.putMilk();
        super.putIngredients();
    }
}
