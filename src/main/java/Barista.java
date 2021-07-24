public class Barista {

    private String name;

    //public Drink drink;

     static Drink order(MenuItem item){ //static 으로 안 하면 에러뜸,,!
        int idx = item.getIdx();
        return makeDrink(idx);
    }

    public static Drink makeDrink(int _idx){
         //Drink drink = null;
        Drink drink = new Drink(); //어차피 덮어쓸건데, new Drink랑 null 중에 뭐가 나은지

        switch (_idx){
            case 0: drink = new Americano();
                    break;
            case 1: drink = new Americano(true);
                    break;
            case 2: drink = new Latte();
                    break;
            case 3: drink = new Latte(true);
                    break;
            case 4 : drink = new VanillaLatte();
                    break;
            case 5: drink = new VanillaLatte(true);
                    break;
            case 6: drink = new StrwSmoothie();
                    break;
            case 7: drink = new YgrtSmoothie();
                    break;
            case 8: drink = new IceTea();
                    break;
        }

        drink.putIngredients();
        return drink;
    }



}
