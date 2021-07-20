public class YogurtSmoothie extends Smoothie {

    YogurtSmoothie(String name, boolean isIced) {
        super(name, isIced);
    }

    public void putYogurt(){
        System.out.println("요거트를 넣는다.");
    }
    @Override
    public void putIngredients() {
        super.putIngredients();
        putYogurt();
        super.useMixer();
    }
}
