
public class YogurtSmoothie extends Smoothie{
	public void putYogurt() {
		System.out.println("요거트를 넣는다.");
	}
	public void getRecipe() {
		putMilk();
		putYogurt();
		mix();
	}
}
