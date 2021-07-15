import java.util.Vector;

public class Drink {
     String name;
     Boolean isIce = false;
     Boolean isSmth = false;
     //Boolean isLatte = false;
     Vector<String> ingredients = new Vector();



    public void printName()
    {
        System.out.println(name);
    }

    public void setName(String _name)
    {
        name = _name;
    }

//    public Vector getIngredients()
//    {
//        return ingredients;
//    }

    public Boolean getIsIce()
    {
        return isIce;
    }

    public void addIce()
    {
        ingredients.add("얼음");
    }


}
