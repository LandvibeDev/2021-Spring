public class CafeLatte extends Coffee {
    CafeLatte(String name, Boolean isIce) {
        super(name,isIce);
    }
    @Override
     void putIngredients(){//우유,에스프레소,얼음
        super.putMilk();
        super.putIngredients();
    }

}
