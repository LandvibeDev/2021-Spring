import java.util.ArrayList;
import java.util.Vector;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    Menu()
    {
        menuItems.add(new MenuItem("아메리카노(hot)", 0));
        menuItems.add(new MenuItem("아메리카노(ice)",1));
        menuItems.add(new MenuItem("카페라떼(hot)",2));
        menuItems.add(new MenuItem("카페라떼(ice)",3));
        menuItems.add(new MenuItem("바닐라라떼(hot)",4));
        menuItems.add(new MenuItem("바닐라라떼(ice)",5));
        menuItems.add(new MenuItem("딸기 스무디",6));
        menuItems.add(new MenuItem("요거트 스무디",7));
        menuItems.add(new MenuItem("아이스티", 8));

    }


    public void printMenuItems()
    {
        for(MenuItem m : menuItems)
        {
            System.out.println(m.getName());
        }
        System.out.println("\n");
    }

    public MenuItem getMenuItem(int orderDrinkNum)
    {
        return menuItems.get(orderDrinkNum);
    }
}
