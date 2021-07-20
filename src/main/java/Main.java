public class Main {
    public static void main(String[] args) {

        CoffeeShop coffeeShop = new CoffeeShop();
        Menu menu = new Menu();
        Barista barista = new Barista();

        coffeeShop.init(menu);
        coffeeShop.showManual();

        menu.printMenuItems();
        try{
            Drink drink = barista.order(menu.getMenuItem("바닐라라떼(ICE)"));
            drink.putIngredients();
        }catch (IllegalAccessException e){
            System.out.println(e.toString());
        }
    }
}
