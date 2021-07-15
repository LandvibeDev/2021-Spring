import java.util.Vector;

public class MenuItem {
    private String name;
    private int idx;


    MenuItem(String _name, int _idx)
    {
        name = _name;
        idx =_idx;
    }

    public String getName()
    {
        return name;
    }

    public int getIdx()
    {
        return idx;
    }

}
