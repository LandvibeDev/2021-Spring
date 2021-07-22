
public class MenuItem {
	private String name;
	private int idx;

	MenuItem(String name, int idx){
		this.name = name;
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setName(String name) {
		this.name = name;
	}
}
