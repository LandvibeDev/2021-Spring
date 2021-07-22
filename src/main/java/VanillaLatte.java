
public class VanillaLatte extends CaffeLatte {
	VanillaLatte(String name) {
		super(name);
	}

	@Override
	public void putIngredients() {
		super.putIngredients();
		putVanilla();
	}
}
