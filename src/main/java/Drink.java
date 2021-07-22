
public class Drink {
	private String name;
	Drink(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void putWater() {
		System.out.println("물을 넣는다.");
	}
	public void putMilk() {
		System.out.println("우유를 넣는다.");
	}
	public void putIce() {
		System.out.println("얼음을 넣는다.");
	}
	public void putEspresso() {
		System.out.println("에스프레소를 넣는다.");
	}
	public void putTea(){
		System.out.println("아이스티 분말을 넣는다.");
	}
	public void mix() {
		System.out.println("믹서기를 이용해 섞는다.");
	}
	public void putStrawberry() {
		System.out.println("딸기를 넣는다.");
	}
	public void putVanilla() {
		System.out.println("바닐라 시럽을 넣는다.");
	}
	public void putYogurt() {
		System.out.println("요거트를 넣는다.");
	}
	public void putIngredients() {}

	public void printName() {
		System.out.println(name);
	}
}
