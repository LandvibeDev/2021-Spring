import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItemList = new ArrayList<>();
    List<String> typeList = new ArrayList<>();
    List<String> nameList = new ArrayList<>();
    void setMenuItem(String name,String type,String[] material)
    {
        MenuItem menuItem = new MenuItem();
        menuItem.name = name;
        menuItem.type = type;
        menuItem.material = material;
        if(!typeList.contains(menuItem.type))
            typeList.add(menuItem.type);
        if(nameList.isEmpty() || !nameList.contains(menuItem.name))
            nameList.add(menuItem.name);

        menuItemList.add(menuItem);
    }
    MenuItem getMenuItem(String name)
    {
        MenuItem menuItem = new MenuItem();
        for(int i=0;i< menuItemList.size();i++)
            if(menuItemList.get(i).name.equals(name))
                return menuItem = menuItemList.get(i);
        return menuItem;
    }
    void printMenuItems()
    {
        String curType;
        for(int i=0;i<typeList.size();i++)          // type 별로 분류
        {
            curType = typeList.get(i);
            System.out.println("<"+curType+">");
            for(int j=0;j< menuItemList.size();j++)     // 음료 list에서 type에 맞는것으로
            {
                if(menuItemList.get(j).type.equals(curType))
                    System.out.println("* "+ menuItemList.get(j).name);
            }
        }
    }
}
