public class IceTea extends Drink{
    IceTea(){
        name = "아이스티";
        isIce = true;
    }

    @Override
    public void putWater() {
        super.putWater();
    }

    public void putIceTeaPowder(){
        System.out.println("아이스티 분말을 넣는다.");
    }

    @Override
    public void putIngredients() {
        putWater();
        putIceTeaPowder();
        super.putIngredients();
    }//물, 아이스티 분말, 얼음
}
