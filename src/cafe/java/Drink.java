public class Drink {
    protected String name;
    protected Boolean isIce;

     Drink(String name, Boolean isIce) {
        this.name = name;
        this.isIce=isIce;
    }

    void printName(){ //메뉴이름 출력
        System.out.println("메뉴 : "+name);
    }

     String getName(){
        return name;
    }

    void putWater(){
        System.out.println("물을 넣는다.");
    }
    void putMilk(){
        System.out.println("우유 넣는다.");
    }
    void putIce(){
        System.out.println("얼음을 넣는다.");
    }

    void putIngredients(){ //얼음
        if(isIce)
            putIce();
   }


    public void putStrawberry(){
        System.out.println("딸기를 넣는다.");
    }

}
