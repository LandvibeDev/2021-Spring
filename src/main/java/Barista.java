public class Barista {
    Drink order(MenuItem menuItem)
    {
        Drink drink = new Drink();
        drink.setName(menuItem.getName());
        drink.setType(menuItem.getType());
        drink.setMaterial(menuItem.getMaterial());

        System.out.println(drink.getName()+" 제조법");
        for(int i=0;i<drink.getMaterial().length;i++)
        {
            System.out.println((i+1)+". " + drink.getMaterial()[i] + " 을(를) 넣는다.");
        }
        if(drink.getType().equals("스무디"))
            System.out.println((drink.getMaterial().length+1) +". 믹서기를 이용해 섞는다.");
        return drink;
    }
}
