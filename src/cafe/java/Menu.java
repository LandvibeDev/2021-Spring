import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void printMenuItems() {
      for(MenuItem m : menuItem){
          System.out.println(m.getName());
      }
        System.out.println("\n");

    }

    private MenuItem[] menuItem;

    ArrayList<MenuItem> menuItems=new ArrayList<MenuItem>();
    Menu(){

        menuItems.add(new MenuItem(1,"ICE 아메리카노"));
        menuItems.add(new MenuItem(2,"HOT 아메리카노"));
        menuItems.add(new MenuItem(3,"ICE 카페라떼"));
        menuItems.add(new MenuItem(4,"HOT 카페라떼"));
        menuItems.add(new MenuItem(5,"ICE 바닐라라떼"));
        menuItems.add(new MenuItem(6,"HOU 바닐라라떼"));
        menuItems.add(new MenuItem(7,"딸기 스무디"));
        menuItems.add(new MenuItem(8,"요거트 스무디"));
        menuItems.add(new MenuItem(9,"아이스티"));

    }


    //메뉴
    MenuItem getMenuItem(int a) {
        return menuItems.get(a);
        //여기서 생성자에 (id,name)인데 get(a)로 하면 저절로 id기준으로 찾아주는건지 모르겠당..
    }


}