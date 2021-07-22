public class Coffee extends Drink {

    Coffee(String name, Boolean isIce) {
       super(name,isIce);
       //부모생성자
       //Coffee에서도 Drink처럼 name,isIce 가짐.
    }

    public void putEspresso(){
        System.out.println("에스프레소를 넣는다");
    }

    @Override
    void putIngredients(){//에스프레소,얼음
       putEspresso();
       super.putIngredients();
    }


}
