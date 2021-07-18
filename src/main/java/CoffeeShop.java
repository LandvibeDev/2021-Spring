public class CoffeeShop {
    void showManual()
    {
        System.out.println("메뉴 확인 : 메뉴");
        System.out.println("제조법 확인 : [메뉴명]");
        System.out.println("예시 : 바닐라라떼(ICE) --> (ICE/HOT)여부까지 정확하게 입력해 주세요!");
        System.out.println("종료 : 수고하세요");
    }

    // 메뉴 입력
    void init(Menu menu)
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

}
