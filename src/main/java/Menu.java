import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> menuItems = new ArrayList<>();
	
	Menu(){
		menuItems.add(new MenuItem("아이스 아메리카노", 0));
		menuItems.add(new MenuItem("따뜻한 아메리카노", 1));
		menuItems.add(new MenuItem("아이스 카페라떼", 2));
		menuItems.add(new MenuItem("따뜻한 카페라떼", 3));
		menuItems.add(new MenuItem("아이스 바닐라라떼", 4));
		menuItems.add(new MenuItem("따뜻한 바닐라라떼", 5));
		menuItems.add(new MenuItem("딸기 스무디", 6));
		menuItems.add(new MenuItem("요거트 스무디", 7));
		menuItems.add(new MenuItem("아이스티", 8));
	}
	
	public void printMenuItems() {
		for(int i = 0; i<menuItems.size();i++) {
			System.out.println( i +". " +menuItems.get(i).getName());
		}
	}
	
	public MenuItem getMenuItem(int idx) {
		return menuItems.get(idx);
	}
}
