import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItemLists = new ArrayList<>();
    private List<String> typeLists = new ArrayList<>();

    public List<MenuItem> getMenuItemLists() {
        return menuItemLists;
    }

    public List<String> getTypeLists() {
        return typeLists;
    }
    void addMenuItem(String name, String type) {
        MenuItem menuItem = new MenuItem(name,type);
        if(!typeLists.contains(menuItem.getType()))
            typeLists.add(menuItem.getType());
        menuItemLists.add(menuItem);
    }
    MenuItem getMenuItem(String name) {
        for(int i=0;i< menuItemLists.size();i++)
            if(menuItemLists.get(i).getName().equals(name))
                return menuItemLists.get(i);
        return null;
    }
    void printMenuItems() {
        String curType;
        for(int i=0;i<typeLists.size();i++)          // type 별로 분류
        {
            curType = typeLists.get(i);
            System.out.println("<"+curType+">");
            for(int j=0;j< menuItemLists.size();j++)     // 음료 list에서 type에 맞는것으로
            {
                if(menuItemLists.get(j).getType().equals(curType))
                    System.out.println("* "+ menuItemLists.get(j).getName());
            }
        }
    }
}
