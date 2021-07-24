import java.util.ArrayList;
import java.util.Vector;

public class Drink {
    protected String name;
    protected Boolean isIce = false;
    protected ArrayList<String> ingredients = new ArrayList<>();



    public void printName(){
        System.out.println(name);
        System.out.println();
    }

    public void setName(String name){
        this.name = name;
    }

    public void putIce(){
        //ingredients.add("얼음");
        System.out.println("얼음을 넣는다.");
    }

    public void putWater(){
        //ingredients.add("물");
        System.out.println("물을 넣는다.");
    }

    //얼음
    public void putIngredients(){
        if(isIce){
            putIce();
        }
        System.out.println();
    }


}
