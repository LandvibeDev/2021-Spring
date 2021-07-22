
public class Coffee extends Drink{
	Coffee(String name) {
		super(name);
	}

	@Override
	public void putIngredients() {
		putEspresso();
	}
}
