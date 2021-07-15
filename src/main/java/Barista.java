public class Barista {
    private static int idx;
    private String name;

    static Drink drink;

    public static Drink order(MenuItem item)
    {
        //name = item.getName();
        idx = item.getIdx();
        makeDrink(idx);

        for(String s : drink.ingredients)
        {
            System.out.println(s + "을(를) 넣는다.");
        }
        if(drink.isSmth)
            System.out.println("믹서기를 이용해 섞는다.");

        return drink;
    }

    public static void makeDrink(int _idx)
    {
        //if(_idx == "아메리카노(hot)")   drink = new HotAme();
        //else if(_name == "아메리카노 ")

        switch (_idx)
        {
            case 0: drink = new HotAme();
                    break;
            case 1: drink = new IceAme();
                    break;
            case 2: drink = new HotLatte();
                break;
            case 3: drink = new IceLatte();
                break;
            case 4 : drink = new HotVanLatte();
                break;
            case 5: drink = new IceVanLatte();
                break;
            case 6: drink = new StrSmth();
                break;
            case 7: drink = new YogSmth();
                break;
            case 8: drink = new IceTea();
                break;
        }

        if(drink.getIsIce())
        {
            drink.addIce();
        }
    }



}
