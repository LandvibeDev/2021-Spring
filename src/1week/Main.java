public class Main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.printMenuItems();
		MenuItem menuItem = menu.getMenuItem(9);
		Barista barista = new Barista();
		Drink drink = barista.order(menuItem);
		drink.printName();
	}
}