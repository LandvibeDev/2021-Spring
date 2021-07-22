package Cafe;

import Cafe.MenuItem;

import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuItem> menuItems=new HashMap<>();

    public Menu(){
        menuItems.put(0,new MenuItem("아메리카노"));
        menuItems.put(1,new MenuItem("아이스 아메리카노"));
        menuItems.put(2,new MenuItem("카페 라떼"));
        menuItems.put(3,new MenuItem("아이스 카페 라떼"));
        menuItems.put(4,new MenuItem("바닐라 라떼"));
        menuItems.put(5,new MenuItem("아이스 바닐라 라떼"));
        menuItems.put(6,new MenuItem("딸기 스무디"));
        menuItems.put(7,new MenuItem("요거트 스무디"));
        menuItems.put(8,new MenuItem("아이스티"));
    }

    void printMenuItems(){
        System.out.println( "========< MENU >======="+"\n"+"- 커피"+"\n"+"   1. 아메리카노(ICE/HOT)"+"\n"+"   2. 카페라떼(ICE/HOT)"+"\n"+"   3. 바닐라라떼(ICE/HOT)"+"\n"
                +"- 스무디"+"\n"+"   1. 딸기 스무디"+"\n"+"   2. 요거트 스무디"+"\n"+"- 주스"+"\n"+"   1. 아이스티"+"\n");

    }

    MenuItem getMenuItem(int num){
        return menuItems.get(num);
    }
}
