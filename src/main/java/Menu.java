import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItemList = new ArrayList<>();
    List<String> typeList = new ArrayList<>();
    List<String> nameList = new ArrayList<>();
    void setMenuItem(String name,String type,String[] material)
    {
        MenuItem menuItem = new MenuItem();
        menuItem.setName(name);
        menuItem.setType(type);
        menuItem.setMaterial(material);
        if(!typeList.contains(menuItem.getType()))
            typeList.add(menuItem.getType());
        if(nameList.isEmpty() || !nameList.contains(menuItem.getName()))
            nameList.add(menuItem.getName());

        menuItemList.add(menuItem);
    }
    MenuItem getMenuItem(String name)
    {
        MenuItem menuItem = new MenuItem();
        for(int i=0;i< menuItemList.size();i++)
            if(menuItemList.get(i).getName().equals(name))
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
                if(menuItemList.get(j).getType().equals(curType))
                    System.out.println("* "+ menuItemList.get(j).getName());
            }
        }
    }
}
