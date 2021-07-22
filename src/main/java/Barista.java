
public class Barista {
	
	public Drink order(MenuItem menuItem) {
		Drink drink = null;
		switch(menuItem.getIdx()) {
		case 0:
			drink = new Americano("아이스 아메리카노");
			drink.putIngredients();
			drink.putIce();
			break;
		case 1:
			drink = new Americano("따뜻한 아메리카노");
			drink.putIngredients();
			break;
		case 2:
			drink = new CaffeLatte("아이스 카페라떼");
			drink.putIngredients();
			drink.putIce();
			break;
		case 3:
			drink = new CaffeLatte("따뜻한 카페라떼");
			drink.putIngredients();
			break;
		case 4:
			drink = new VanillaLatte("아이스 바닐라라떼");
			drink.putIngredients();
			drink.putIce();
			break;
		case 5:
			drink = new VanillaLatte("따뜻한 바닐라라떼");
			drink.putIngredients();
			break;
		case 6:
			drink = new StrawberrySmoothie("딸기 스무디");
			drink.putIngredients();
			drink.mix();
			break;
		case 7:
			drink = new YogurtSmoothie("요거트 스무디");
			drink.putIngredients();
			drink.mix();
			break;
		case 8:
			drink = new Icetea("아이스티");
			drink.putIngredients();
			break;
		default:
			break;
		}
		return drink;
	}
}
