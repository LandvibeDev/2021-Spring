public class Barista {
    Drink order(MenuItem menuItem) throws IllegalAccessException {
        if(menuItem==null) {
            throw new IllegalAccessException("해당 메뉴가 없습니다.");
        }
        System.out.println("<"+menuItem.getName()+" 제조법>");
        switch(menuItem.getName()){
            case "아메리카노(ICE)":
                return new Americano(menuItem.getName(),true);
            case "아메리카노(HOT)":
                return new Americano(menuItem.getName(),false);
            case "카페라떼(ICE)":
                return new CafeLatte(menuItem.getName(),true);
            case "카페라떼(HOT)":
                return new CafeLatte(menuItem.getName(),false);
            case "바닐라라떼(ICE)":
                return new VanillaLatte(menuItem.getName(),true);
            case "바닐라라떼(HOT)":
                return new VanillaLatte(menuItem.getName(),false);
            case "딸기 스무디":
                return new StrawberrySmoothie(menuItem.getName(),false);
            case "요거트 스무디":
                return new YogurtSmoothie(menuItem.getName(),false);
            case "아이스티":
                return new IceTea(menuItem.getName(),false);
            default:
                return null;
        }
    }
}
