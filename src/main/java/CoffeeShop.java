import java.util.Arrays;
import java.util.List;

public class CoffeeShop {
    void showManual() {
        System.out.println("메뉴 확인 : 메뉴");
        System.out.println("제조법 확인 : [메뉴명]");
        System.out.println("예시 : 바닐라라떼(ICE) --> (ICE/HOT)여부까지 정확하게 입력해 주세요!");
        System.out.println("종료 : 수고하세요");
    }

    // 메뉴 입력
    void init(Menu menu) {
        List<String> typeLists = Arrays.asList("커피","스무디","주스");
        menu.setTypeLists(typeLists);
        try{
        menu.addMenuItem("아메리카노(ICE)","커피");
        menu.addMenuItem("아메리카노(HOT)","커피");
        menu.addMenuItem("카페라떼(ICE)","커피");
        menu.addMenuItem("카페라떼(HOT)","커피");
        menu.addMenuItem("바닐라라떼(ICE)","커피");
        menu.addMenuItem("바닐라라떼(HOT)","커피");

        menu.addMenuItem("딸기 스무디","스무디");
        menu.addMenuItem("요거트 스무디","스무디");

        menu.addMenuItem("아이스티","주스");
        }catch (IllegalAccessException e){
            System.out.println(e.toString());
        }
    }

}
