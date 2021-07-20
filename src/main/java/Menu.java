import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Menu {
    private List<MenuItem> menuItemLists = new ArrayList<>();
    private List<String> typeLists = new ArrayList<>();

    public void setTypeLists(List<String> typeLists) {
        this.typeLists = typeLists;
    }

    public List<MenuItem> getMenuItemLists() {
        return menuItemLists;
    }

    public List<String> getTypeLists() {
        return typeLists;
    }
    void addMenuItem(String name, String type) throws IllegalAccessException {
        MenuItem menuItem = new MenuItem(name,type);
        if(!typeLists.contains(menuItem.getType()))
            throw new IllegalAccessException("해당 종류가 존재하지 않습니다.");
        menuItemLists.add(menuItem);
    }
    MenuItem getMenuItem(String name) {
        for(MenuItem menuItem : menuItemLists)
            if(menuItem.getName().equals(name))
                return menuItem;
        return null;
    }
    void printMenuItems() {
        Map<String,List<MenuItem>> menuListByType = menuItemLists
                .stream()
                .collect(Collectors.groupingBy(MenuItem::getType));
        menuListByType.forEach((key,value)->{
            System.out.println("<"+key+">");
            value.forEach(v -> System.out.println(v.getName()));
        });
    }
}
