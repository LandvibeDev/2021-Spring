public class Smoothie extends Drink{
    Smoothie(String name, boolean isIced) {
        super(name, isIced);
    }
    public void useMixer(){
        System.out.println("믹서기를 이용해 섞는다.");
    }
    @Override
    public void putIngredients(){
        super.putMilk();
    }
}
