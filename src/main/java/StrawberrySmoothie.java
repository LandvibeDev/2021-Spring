
public class StrawberrySmoothie extends Smoothie {
	StrawberrySmoothie(String name) {
		super(name);
	}

	@Override
	public void putIngredients() {
		putMilk();
		putStrawberry();
	}
}
