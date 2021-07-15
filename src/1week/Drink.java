
public class Drink {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void putWater() {
		System.out.println("물을 넣는다.");
	}
	public void putIce() {
		System.out.println("얼음을 넣는다.");
	}
	public void printName() {
		System.out.println(name);
	}
}
