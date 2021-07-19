public class IceTea extends Drink{


    IceTea(String name, boolean isIced) {
        super(name, isIced);
    }

    public void putIceTeaPowder(){
        System.out.println("아이스티 분말을 넣는다.");
    }
    @Override
    public void putIngredients(){
        super.putWater();
        putIceTeaPowder();
        super.putIce();
    }
}
