
public class VanillaLatte extends CaffeLatte {
	public void putVanilla() {
		System.out.println("바닐라 시럽을 넣는다.");
	}
	public void getRecipe() {
		super.getRecipe();
		putVanilla();
	}
}
