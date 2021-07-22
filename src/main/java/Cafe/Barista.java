package Cafe;

public class Barista {
    Drink order(MenuItem m){
    //스위치 케이스
        switch (m.getName()){
            case "아메리카노": {
                Drink drink=new Americano("아메리카노", false);
                drink.putIngredients();
                return drink;
            }
            case "아이스 아메리카노": {
                Drink drink=new Americano("아메리카노", true);
                drink.putIngredients();
                return drink;
            }
            case "카페 라떼": {
                Drink drink=new CaffeLatte("카페 라떼", false);
                drink.putIngredients();
                return drink;
            }
            case "아이스 카페 라떼": {
                Drink drink=new CaffeLatte("아이스 카페 라떼", true);
                drink.putIngredients();
                return drink;
            }
            case "아이스 바닐라 라떼": {
                Drink drink=new VanillaLatte("아이스 바닐라 라떼", true);
                drink.putIngredients();
                return drink;
            }
            case "바닐라 라떼": {
                Drink drink=new VanillaLatte("바닐라 라떼", false);
                drink.putIngredients();
                return drink;
            }
            case "딸기 스무디": {
                Drink drink=new StrawberrySmoothie("딸기 스무디", true);
                drink.putIngredients();
                return drink;
            }
            case "요거트 스무디": {
                Drink drink=new YogurtSmoothie("요거트 스무디", true);
                drink.putIngredients();
                return drink;
            }
            case "아이스티": {
                Drink drink=new IceTea("아이스티", true);
                drink.putIngredients();
                return drink;
            }
            default:
                return null;
        }
    }
}
