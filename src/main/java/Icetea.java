
public class Icetea extends Drink{
	Icetea(String name) {
		super(name);
	}

	@Override
	public void putIngredients() {
		putWater();
		putTea();
		putIce();
	}
}
