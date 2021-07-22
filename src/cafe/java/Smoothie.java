public class Smoothie extends Drink {
    Smoothie(String name, Boolean isIce) {
        super(name,isIce);
    }

    void mix(){
        System.out.println("믹서기를 이용해 섞는다.");
    }

    @Override
    void putIngredients(){ //우유,섞는다
        super.putMilk();
        super.putIngredients();
        mix();
    }
}
