
public class Barista {
	
	public Drink order(MenuItem menuItem) {
		Drink drink = new Drink();
		drink.setName(menuItem.getName());
		if(menuItem.getName().equals("아이스 아메리카노")) {
			Americano americano = new Americano();
			americano.getRecipe();
			drink.putIce();
		}
		else if(menuItem.getName().equals("따뜻한 아메리카노")) {
			Americano americano = new Americano();
			americano.getRecipe();
		}
		else if(menuItem.getName().equals("아이스 카페라떼")) {
			CaffeLatte caffeLatte = new CaffeLatte();
			caffeLatte.getRecipe();
			drink.putIce();
		}
		else if(menuItem.getName().equals("따뜻한 카페라떼")) {
			CaffeLatte caffeLatte = new CaffeLatte();
			caffeLatte.getRecipe();
		}
		else if(menuItem.getName().equals("아이스 바닐라라떼")) {
			VanillaLatte vanillaLatte = new VanillaLatte();
			vanillaLatte.getRecipe();
			drink.putIce();
		}
		else if(menuItem.getName().equals("따뜻한 바닐라라떼")) {
			VanillaLatte vanillaLatte = new VanillaLatte();
			vanillaLatte.getRecipe();
		}
		else if(menuItem.getName().equals("딸기 스무디")) {
			StrawberrySmoothie strawberrySmoothie= new StrawberrySmoothie();
			strawberrySmoothie.getRecipe();
		}
		else if(menuItem.getName().equals("요거트 스무디")) {
			YogurtSmoothie yogurtSmoothie= new YogurtSmoothie();
			yogurtSmoothie.getRecipe();
		}
		else if(menuItem.getName().equals("아이스티")) {
			Icetea icetea= new Icetea();
			icetea.getRecipe();
		}
		return drink;
	}
}
