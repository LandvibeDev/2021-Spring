public class VanillaLatte extends Latte{
    VanillaLatte(String name, boolean isIced) {
        super(name, isIced);
    }
    public void putVanillaSyrup(){
        System.out.println("바닐라 시럽을 넣는다.");
    }
    @Override
    public void putIngredients(){
        putVanillaSyrup();
        super.putIngredients();
    }
}
