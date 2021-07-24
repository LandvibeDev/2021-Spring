public class Americano extends Coffee{

    Americano(){
        isIce = false;
        name = "아메리카노(hot)";
    }
    Americano(Boolean isIce){
        super.isIce = isIce;

        if(isIce)   name = "아메리카노(ice)";
        else    name = "아메리카노(hot)";
    }

    @Override
    public void putWater() {
        super.putWater();
    }

    @Override
    public void putEspresso() {
        super.putEspresso();
    }

    @Override
    public void putIngredients() {
        putWater();
        putEspresso();
        super.putIngredients();
    }//물, 에스프레소, 얼음
}
