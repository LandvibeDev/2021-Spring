import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String command = "";
        Scanner scanner = new Scanner(System.in);

        CoffeeShop coffeeShop = new CoffeeShop();
        Menu menu = new Menu();
        Barista barista = new Barista();

        coffeeShop.init(menu);
        coffeeShop.showManual();

        while(true)
        {
            System.out.println("=>무엇을 도와드릴까요?");
            command = scanner.nextLine();
            if(command.equals("메뉴"))
                menu.printMenuItems();
            else if(menu.nameList.contains(command))
            {
                Drink drink;
                drink = barista.order(menu.getMenuItem(command));
                drink.printName();
            }
            else{
                System.out.println("안녕히가세요");
                break;
            }
        }

    }
}
