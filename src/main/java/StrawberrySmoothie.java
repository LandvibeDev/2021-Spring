public class StrawberrySmoothie extends Smoothie{

    StrawberrySmoothie(String name, boolean isIced) {
        super(name, isIced);
    }

    public void putStrawberry(){
        System.out.println("딸기를 넣는다.");
    }
    @Override
    public void putIngredients(){
        super.putIngredients();
        putStrawberry();
        super.useMixer();
    }
}
