package Cafe;

import Cafe.Barista;
import Cafe.Drink;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Barista barista = new Barista();
        Customer customer = new Customer();

        menu.printMenuItems();

        int num= customer.selectMenu();
        if (num==-1)
            return;
        MenuItem menuItem = menu.getMenuItem(num);
        Drink drink = barista.order(menuItem);

        drink.printName();

    }
}
