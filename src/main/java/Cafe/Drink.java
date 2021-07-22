package Cafe;

public class Drink {
    private String name;
    private boolean isIce;
    Drink(String n, boolean ice){
        name=n;
        isIce=ice;
    }
    void printName(){ //이름만출력
        System.out.println("주문 메뉴 : "+name);
    }
    void putIngredients(){
        if (isIce)
            putIce();
    }
    void putWater(){
        System.out.println("- 물을 넣는다.\r");
    }
    void putMilk() {
        System.out.println("- 우유를 넣는다.\r");
    }
    void putIce(){
        System.out.println("- (ice) 얼음을 넣는다.");
    }
}
