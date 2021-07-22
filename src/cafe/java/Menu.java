import java.util.Scanner;

public class Menu {

    public void printMenuItems() {
        String menu_list="\n\n"+"------< MENU >------"+"\n\n"
                +"- 커피"+"\n"+"   1. 아메리카노(ICE/HOT)"+"\n"+"   2. 카페라떼(ICE/HOT)"+"\n"+"   3. 바닐라라떼(ICE/HOT)"+"\n"
                +"- 스무디"+"\n"+"   1. 딸기 스무디"+"\n"+"   2. 요거트 스무디"+"\n"+"- 주스"+"\n"
                +"   1. 아이스티"+"\n";
        System.out.println(menu_list);

    }

    private MenuItem[] menuItem;

    Menu(){
        menuItem=new MenuItem[9];
        for(int i=1; i<=9; i++) {
            menuItem[i] = new MenuItem();
        }
        menuItem[1].setName("ICE 아메리카노");
        menuItem[2].setName("HOT 아메리카노");
        menuItem[3].setName("ICE 카페라떼");
        menuItem[4].setName("HOT 카페라떼");
        menuItem[5].setName("ICT 바닐라라떼");
        menuItem[6].setName("HOT 바닐라라떼");
        menuItem[7].setName("딸기 스무디");
        menuItem[8].setName("요거트 스무디");
        menuItem[9].setName("아이스티");
    }

    //메뉴
    public MenuItem getMenuItem(int a) {
        MenuItem menu=new MenuItem();
        menu.setName(menuItem[a].getName());
        return menu;
    }

    public static void main(String[] args) {
        //주문


        Menu menu= new Menu();
        Barista barista=new Barista();

        menu.printMenuItems();


        MenuItem mI=menu.getMenuItem(1);
        Drink drink=barista.order(mI);
        drink.printName();



    }

}