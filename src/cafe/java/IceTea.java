public class IceTea extends Drink{
    IceTea(String name, Boolean isIce) {
        super(name,isIce);
    }

    public void putIceteaPowder(){
        System.out.println("아이스티 분말을 넣는다.");
    }

    @Override
    void putIngredients(){//물,아이스티분말,얼음
        super.putWater();
        putIceteaPowder();
        super.putIngredients();
    }

}
