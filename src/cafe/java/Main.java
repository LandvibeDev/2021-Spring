public class Main {
    public static void main(String[] args) {
        //주문
        Menu menu= new Menu();
        Barista barista=new Barista();

        menu.printMenuItems();

        MenuItem menuItem=menu.getMenuItem(9);
        Drink drink=barista.order(menuItem);
        drink.printName();



    }

}
