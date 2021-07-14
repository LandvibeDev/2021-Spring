package Cafe;

import Cafe.MenuItem;

import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuItem> menuItems=new HashMap<>();
    String[] list = new String[]{"아메리카노", "아이스 아메리카노", "카페 라떼", "아이스 카페 라떼", "바닐라 라떼", "아이스 바닐라 라떼",
            "딸기 스무디", "요거트 스무디", "아이스티"};
    public Menu(){
        int i=0;
        for (String name : list)
        {
            MenuItem in = new MenuItem();
            in.setName(name);
            menuItems.put(i,in);
            i++;
        }
    }

    void printMenuItems(){
        System.out.println( "========< MENU >======="+"\n"+"- 커피"+"\n"+"   1. 아메리카노(ICE/HOT)"+"\n"+"   2. 카페라떼(ICE/HOT)"+"\n"+"   3. 바닐라라떼(ICE/HOT)"+"\n"
                +"- 스무디"+"\n"+"   1. 딸기 스무디"+"\n"+"   2. 요거트 스무디"+"\n"+"- 주스"+"\n"+"   1. 아이스티"+"\n");

    }

    MenuItem getMenuItem(int num){
        return menuItems.get(num);
    }
}
