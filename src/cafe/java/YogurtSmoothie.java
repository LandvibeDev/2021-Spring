public class YogurtSmoothie extends Smoothie{
    YogurtSmoothie(String name, Boolean isIce) {
        super(name,isIce);
    }

    void putYogurt(){
        System.out.println("요거트를 넣는다.");
    }

    @Override
    void putIngredients(){ //우유,요거트,섞는다
        putYogurt();
        super.putIngredients();
    }

}
