public class Coffee extends Drink {

    Coffee(String name, boolean isIced) {
        super(name, isIced);
    }

    public void putEspresso(){
        System.out.println("에스프레소를 넣는다.");
    }

    @Override
    public void putIngredients() {
        putEspresso();
        super.putIngredients();
    }
}
