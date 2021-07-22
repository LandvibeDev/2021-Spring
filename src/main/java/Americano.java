
public class Americano extends Coffee{
	Americano(String name) {
		super(name);
	}

	@Override
	public void putIngredients() {
		putWater();
		super.putIngredients();
	}
}
