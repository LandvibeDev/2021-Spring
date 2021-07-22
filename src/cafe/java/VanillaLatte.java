public class VanillaLatte extends CafeLatte{
    VanillaLatte(String name, Boolean isIce) {
        super(name,isIce);
    }

    void putVanillaSyrup(){
        System.out.println("바닐라 시럽을 넣는다.");
    }

    @Override
    void putIngredients(){
       putVanillaSyrup();
       super.putIngredients();
    }

}
