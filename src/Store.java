import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Store {
	private String storename;
	private Map<String, String> bookauthor = new HashMap<>();
	private Book[] b;
	private Author[] a;

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public Map<String, String> getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(Map<String, String> bookauthor) {
		this.bookauthor = bookauthor;
	}

	public void findbook(String nameorauthor) {
		/*
		 * Store s = new Store(); Map <String,String> map = s.getBookauthor();
		 */
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		ArrayList<String> subArrayList = new ArrayList<String>();
		subArrayList.add(" ");
		subArrayList.add(" ");
		list.add(subArrayList);
		System.out.println("查尋結果如下\n");

		for (String key : bookauthor.keySet()) {
			String value = bookauthor.get(key);
			if (value.equals(nameorauthor) || key.equals(nameorauthor)) {
				subArrayList.set(0,key);
				subArrayList.set(1,value);
				list.set(0,subArrayList);
				System.out.println(list);
			}
			
		}
		if (list.isEmpty()) {
			System.out.println("查無書籍\n");
		}
	}

}
