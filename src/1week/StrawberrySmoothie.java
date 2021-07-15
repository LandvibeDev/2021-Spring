
public class StrawberrySmoothie extends Smoothie {
	public void putStrawberry() {
		System.out.println("딸기를 넣는다.");
	}
	public void getRecipe() {
		putMilk();
		putStrawberry();
		mix();
	}
}
