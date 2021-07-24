public class VanillaLatte extends Latte{

    VanillaLatte(){
        super.isIce = false;
        name = "바닐라라떼(hot)";
    }
    VanillaLatte(Boolean isIce){
        super.isIce = isIce;
        if(isIce)   name = "바닐라라떼(ice)";
        else    name = "바닐라라떼(hot)";
    }

    @Override
    public void putMilk() {
        super.putMilk();
    }

    @Override
    public void putEspresso() {
        super.putEspresso();
    }

    public void putSyrup(){
        System.out.println("바닐라 시럽을 넣는다.");
    }

    @Override
    public void putIce() {
        super.putIce();
    }

    @Override
    public void putIngredients() {
        putMilk();
        putEspresso();
        putSyrup();
        if(isIce)   putIce();
        System.out.println();
    }//우유, 에스프레소, 시럽, 얼음
}
