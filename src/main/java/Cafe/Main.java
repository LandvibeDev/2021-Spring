package Cafe;

import Cafe.Barista;
import Cafe.Drink;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Barista barista = new Barista();

        menu.printMenuItems();

        MenuItem menuItem = menu.getMenuItem(8);
        Drink drink = barista.order(menuItem);

        drink.printName();

    }
}
