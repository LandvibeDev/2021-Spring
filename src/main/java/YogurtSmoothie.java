
public class YogurtSmoothie extends Smoothie{
	YogurtSmoothie(String name) {
		super(name);
	}
	
	@Override
	public void putIngredients() {
		putMilk();
		putYogurt();
	}
}
