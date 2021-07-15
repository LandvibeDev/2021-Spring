
public class Menu {
	private MenuItem[] menuItem;
	
	Menu(){
		menuItem = new MenuItem[9];
		for(int i = 0; i < 9; i++) {
			menuItem[i] = new MenuItem();
		}
		menuItem[0].setName("아이스 아메리카노");
		menuItem[1].setName("따뜻한 아메리카노");
		menuItem[2].setName("아이스 카페라떼");
		menuItem[3].setName("따뜻한 카페라떼");
		menuItem[4].setName("아이스 바닐라라떼");
		menuItem[5].setName("따뜻한 바닐라라떼");
		menuItem[6].setName("딸기 스무디");
		menuItem[7].setName("요거트 스무디");
		menuItem[8].setName("아이스티");
	}
	
	public void printMenuItems() {
		for(int i = 0; i<menuItem.length; i++) {
			System.out.println((i+1) +". " +menuItem[i].getName());
		}
	}
	
	public MenuItem getMenuItem(int idx) {
		MenuItem orderItem = new MenuItem();
		orderItem.setName(menuItem[idx-1].getName());
		return orderItem;
	}
}
