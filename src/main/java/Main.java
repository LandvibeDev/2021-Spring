import java.util.Scanner;

public class Main {
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
