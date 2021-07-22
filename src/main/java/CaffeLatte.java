
public class CaffeLatte extends Coffee{
	CaffeLatte(String name) {
		super(name);
	}

	@Override
	public void putIngredients() {
		putMilk();
		super.putIngredients();
	}
}
