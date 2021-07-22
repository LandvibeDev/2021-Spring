public class StrawBerrySmoothie extends Smoothie {
    StrawBerrySmoothie(String name, Boolean isIce) {
        super(name,isIce);
    }

    void putStrawBerry(){
        System.out.println("딸기를 넣는다.");
    }

    @Override
    void putIngredients(){ //우유,딸기,섞는다
        putStrawberry();
        super.putIngredients();
    }

}
