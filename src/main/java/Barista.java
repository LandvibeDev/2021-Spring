public class Barista {
    Drink order(MenuItem menuItem)
    {
        Drink drink = new Drink();
        drink.name = menuItem.name;
        drink.type = menuItem.type;
        drink.material = menuItem.material;

        System.out.println(drink.name+" 제조법");
        for(int i=0;i<drink.material.length;i++)
        {
            System.out.println((i+1)+". " + drink.material[i] + " 을(를) 넣는다.");
        }
        if(drink.type.equals("스무디"))
            System.out.println((drink.material.length+1) +". 믹서기를 이용해 섞는다.");
        return drink;
    }
}
