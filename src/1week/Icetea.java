
public class Icetea extends Drink{
	public void putTea(){
		System.out.println("아이스티 분말을 넣는다.");
	}
	public void getRecipe() {
		putWater();
		putTea();
		putIce();
	}
}
