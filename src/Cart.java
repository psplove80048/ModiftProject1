import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
	private String username;
	private Map<String,String> bookauthor = new HashMap<>();;
	private ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Map<String, String> getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(Map<String, String> bookauthor) {
		this.bookauthor = bookauthor;
	}
	public ArrayList<ArrayList<String>> getList() {
		return list;
	}
	public void setList(ArrayList<ArrayList<String>> list) {
		this.list = list;
	}
	
	public void addbook(String nameorauthor)
	{
		
		ArrayList<String> subArrayList = new ArrayList<String>();
		
		for (String key : bookauthor.keySet()) {
			String value = bookauthor.get(key);
			if (key.equals(nameorauthor)) {
				subArrayList.add(key);
				subArrayList.add(value);
				list.add(subArrayList);
			}
		}
		System.out.println("您目前購物車的清單如下:");
		System.out.println(list);
	}

}
