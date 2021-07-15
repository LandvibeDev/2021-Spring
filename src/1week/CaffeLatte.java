
public class CaffeLatte extends Coffee{
	public void putMilk() {
		System.out.println("우유를 넣는다.");
	}
	public void getRecipe() {
		putMilk();
		super.putEspresso();
	}
}
