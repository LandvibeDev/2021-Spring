public class Latte extends Coffee{

    Latte(){
        super.isIce = false;
        name = "카페라떼(hot)";
    }
    Latte(Boolean isIce){
        super.isIce = isIce;
        if(isIce)   name = "카페라떼(ice)";
        else    name = "카페라떼(hot)";
    }

    public void putMilk(){
        System.out.println("우유를 넣는다.");
    }

    @Override
    public void putEspresso() {
        super.putEspresso();
    }

    @Override
    public void putIngredients() {
        putMilk();
        putEspresso();
        super.putIngredients();
    }//우유, 에스프레소, 얼음
}
