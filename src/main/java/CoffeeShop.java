import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Menu{
    List<MenuItem> menuItemList = new ArrayList<>();
    List<String> typeList = new ArrayList<>();
    List<String> nameList = new ArrayList<>();
    void setMenuItem(String name,String type,String[] material)
    {
        MenuItem menuItem = new MenuItem();
        menuItem.name = name;
        menuItem.type = type;
        menuItem.material = material;
        if(!typeList.contains(menuItem.type))
            typeList.add(menuItem.type);
        if(nameList.isEmpty() || !nameList.contains(menuItem.name))
            nameList.add(menuItem.name);

        menuItemList.add(menuItem);
    }
    MenuItem getMenuItem(String name)
    {
        MenuItem menuItem = new MenuItem();
        for(int i=0;i< menuItemList.size();i++)
            if(menuItemList.get(i).name.equals(name))
                return menuItem = menuItemList.get(i);
        return menuItem;
    }
    void printMenuItems()
    {
        String curType;
        for(int i=0;i<typeList.size();i++)          // type 별로 분류
        {
            curType = typeList.get(i);
            System.out.println("<"+curType+">");
            for(int j=0;j< menuItemList.size();j++)     // 음료 list에서 type에 맞는것으로
            {
                if(menuItemList.get(j).type.equals(curType))
                    System.out.println("* "+ menuItemList.get(j).name);
            }
        }
    }
}
class MenuItem{
    String name;
    String type;
    String[] material;
}
class Barista{
    Drink order(MenuItem menuItem)
    {
        Drink drink = new Drink();
        drink.name = menuItem.name;
        drink.type = menuItem.type;
        drink.material = menuItem.material;

        System.out.println(drink.name+" 제조법");
        for(int i=0;i<drink.material.length;i++)
        {
            System.out.println((i+1)+". " + drink.material[i] + " 을(를) 넣는다.");
        }
        if(drink.type.equals("스무디"))
            System.out.println((drink.material.length+1) +". 믹서기를 이용해 섞는다.");
        return drink;
    }
}

class Drink extends MenuItem{
    public void printName()
    {
        System.out.println(this.name);
    }
}
public class CoffeeShop {

    public static void manual()
    {
        System.out.println("메뉴 확인 : 메뉴");
        System.out.println("제조법 확인 : [메뉴명]");
        System.out.println("예시 : 바닐라라떼(ICE) --> (ICE/HOT)여부까지 정확하게 입력해 주세요!");
        System.out.println("종료 : 수고하세요");
    }

    // 메뉴 입력
    public static void init(Menu menu)
    {
        menu.typeList.add("음료");

        String[] strings = {"물","에스프레소","얼음"};
        menu.setMenuItem("아메리카노(ICE)","커피",strings);
        strings = new String[]{"물", "에스프레소"};
        menu.setMenuItem("아메리카노(HOT)","커피",strings);
        strings = new String[]{"우유", "에스프레소","얼음"};
        menu.setMenuItem("카페라떼(ICE)","커피",strings);
        strings = new String[]{"우유", "에스프레소"};
        menu.setMenuItem("카페라떼(HOT)","커피",strings);
        strings = new String[]{"우유", "에스프레소","바닐라 시럽","얼음"};
        menu.setMenuItem("바닐라라떼(ICE)","커피",strings);
        strings = new String[]{"우유", "에스프레소","바닐라 시럽"};
        menu.setMenuItem("바닐라라떼(HOT)","커피",strings);

        strings = new String[]{"우유", "딸기"};
        menu.setMenuItem("딸기 스무디","스무디",strings);
        strings = new String[]{"우유", "요거트"};
        menu.setMenuItem("요거트 스무디","스무디",strings);

        strings = new String[]{"물", "아이스티 분말","얼음"};
        menu.setMenuItem("아이스티","주스",strings);
    }

    public static void main(String[] args) {
        String command = "";
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        Barista barista = new Barista();
        init(menu);
        manual();

        while(true)
        {
            System.out.println();
            System.out.println("=>무엇을 도와드릴까요?");
            command = scanner.nextLine();
            if(command.equals("메뉴"))
                menu.printMenuItems();
            else if(menu.nameList.contains(command))
            {
                Drink drink;
                drink = barista.order(menu.getMenuItem(command));
                drink.printName();
            }
            else{
                System.out.println("안녕히가세요");
                break;
            }
        }

    }
}