public class Barista {
    Drink order(MenuItem menuItem)
    {
        boolean flag = true;
        Drink drink = new Drink(menuItem.getName(),false);
        System.out.println("<"+drink.getName()+" 제조법>");
        switch(drink.getName()){
            case "아메리카노(ICE)":
                drink = new Americano(drink.getName(), true);
                break;
            case "아메리카노(HOT)":
                drink = new Americano(drink.getName(),false);
                break;
            case "카페라떼(ICE)":
                drink = new CafeLatte(drink.getName(), true);
                break;
            case "카페라떼(HOT)":
                drink = new CafeLatte(drink.getName(),false);
                break;
            case "바닐라라떼(ICE)":
                drink = new VanillaLatte(drink.getName(), true);
                break;
            case "바닐라라떼(HOT)":
                drink = new VanillaLatte(drink.getName(),false);
                break;
            case "딸기 스무디":
                drink = new StrawberrySmoothie(drink.getName(),false);
                break;
            case "요거트 스무디":
                drink = new YogurtSmoothie(drink.getName(),false);
                break;
            case "아이스티":
                drink = new IceTea(drink.getName(),false);
                break;
            default:flag = false;
        }
        if(flag)
            drink.putIngredients();
        return drink;
    }
}
