import java.util.Vector;


public class Main {

    public static void main(String[] args){
        Menu menu = new Menu();
        menu.printMenuItems();
        MenuItem menuItem = menu.getMenuItem(7);

        Drink drink = Barista.order(menuItem);
        drink.printName();


    }



}
