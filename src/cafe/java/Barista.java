public class Barista {
    Drink order(MenuItem menuItem) { //order 자체가 프린트
        switch (menuItem.getName()) {
            case "ICE 아메리카노": {
                Drink drink = new Americano("ICE 아메리카노", true);
                drink.putIngredients();
                return drink;
            }
            case "HOT 아메리카노": {
                Drink drink = new Americano("HOT 아메리카노", false);
                drink.putIngredients();
                return drink;
            }
            case "ICE 카페라떼": {
                Drink drink = new CafeLatte("ICE 카페라떼", true);
                drink.putIngredients();
                return drink;
            }
            case "HOT 카페라떼": {
                Drink drink = new CafeLatte("HOT 카페라떼", false);
                drink.putIngredients();
                return drink;
            }
            case "ICE 바닐라라떼": {
                Drink drink = new VanillaLatte("ICE 바닐라라떼", true);
                drink.putIngredients();
                return drink;
            }
            case "HOT 바닐라라떼": {
                Drink drink = new VanillaLatte("HOT 바닐라라떼", false);
                drink.putIngredients();
                return drink;
            }
            case "딸기 스무디": {
                Drink drink = new StrawBerrySmoothie("딸기 스무디", false);
                drink.putIngredients();
                return drink;
            }
            case "요거트 스무디": {
                Drink drink = new YogurtSmoothie("요거트 스무디", false);
                drink.putIngredients();
                return drink;
            }
            case "아이스티": {
                Drink drink = new IceTea("아이스티", true);
                drink.putIngredients();
                return drink;
            }
            default:
                return null;
        }

    }

}

