public class Drink{
    private String name;
    private boolean isIced;

    Drink(String name,boolean isIced){
        this.name = name;
        this.isIced = isIced;
    }
    public boolean isIced() {
        return isIced;
    }
    public void setIced(boolean iced) {
        isIced = iced;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println(this.getName());
    }
    public void putMilk(){
        System.out.println("우유를 넣는다.");
    }
    public void putWater(){
        System.out.println("물을 넣는다.");
    }
    public void putIce(){
        System.out.println("얼음을 넣는다.");
    }
    public void putIngredients(){
        if(isIced())
            putIce();
    }
}
