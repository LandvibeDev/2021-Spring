public class Coffee extends Drink{

    Coffee(){ //따뜻한
        super.isIce = false; //super 꼭 써줘야하는지
        name = "커피(hot)";
    }

    Coffee(Boolean isIce){
        super.isIce = isIce;
        if(isIce)   name = "커피(ice)";
        else    name = "커피(hot)";
    }

    @Override
    public void putWater() {
        super.putWater(); //함수 변화 없음. 바뀌는게 없는데 override 명시 해줘야하는지..?
    }

    public void putEspresso(){
        ingredients.add("에스프레소");
        System.out.println("에스프레소를 넣는다.");
    }


    @Override
    public void putIngredients() {
        super.putIngredients(); //얼음 넣는건 슈퍼 클래스에서 함
    } //에스프레소, 얼음
}
