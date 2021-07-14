package Cafe;

public class Drink {
    public String name;
    public Drink(String n){
        name=n;
    }
    void printName(){ //이름만출력
        System.out.println("주문 메뉴 : "+name);
    }
}
