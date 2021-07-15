import java.util.Vector;


public class Main {

    public static void main(String[] args)
    {
        Menu menu = new Menu();
       // MenuItem hotAme = new MenuItem("아메리카노(hot)",);
        menu.printMenuItems();
        /*
         * 1, 아이스 아메리카노
         * 2, 아이스 바닐라 라떼
         * ...
         * */
       MenuItem menuItem = menu.getMenuItem(8);

       Drink drink = Barista.order(menuItem);
        /*
         * 원두를 넣는다.
         * 얼음을 넣는다.
         * */
        // Drink 클래스는 1주차 과제에서는 자유롭게 구현 2주차 과제로 상속 적용할 예정
       drink.printName();


        /*
        order 함수에서 프린트 찍어주세요~
        그리고 아래에서는 음료 이름만 프린트 찍는걸로 바꿀게요
         */
    }



}
