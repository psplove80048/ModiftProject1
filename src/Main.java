import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Store s1 = new Store1();
		Store s2 = new Store2();
		s1.setStorename("A");
		s2.setStorename("B");
		Book b1 = new Book1();
		b1.setBookname("�Ѽ~���f��");
		b1.setAuthorname("�F���c�^");
		b1.setStorename("A");
		Book b2 = new Book2();
		b2.setBookname("����");
		b2.setAuthorname("�E��M");
		b2.setStorename("B");
		Book b3 = new Book3();
		b3.setBookname("X���å�");
		b3.setAuthorname("�F���c�^");
		b3.setStorename("A");
		Book b4 = new Book4();
		b4.setBookname("���˩@���]");
		b4.setAuthorname("�ä���");
		b4.setStorename("A");
		Book b5 = new Book5();
		b5.setBookname("�r�l��ۤ�G��");
		b5.setAuthorname("������");
		b5.setStorename("B");
		Book b6 = new Book6();
		b6.setBookname("�ͦ�����");
		b6.setAuthorname("�_���");
		b6.setStorename("B");
		Author a1 = new Author1();
		Author a2 = new Author2();
		Author a3 = new Author3();
		Author a4 = new Author4();
		Author a5 = new Author5();
		a1.setAuthorname("�F���c�^");
		String[] a1book = {b1.getBookname(),b3.getBookname()};
		a1.setBooks(a1book);
		a2.setAuthorname("�E��M");
		String[] a2book = { b2.getBookname()};
		a2.setBooks(a2book);
		a3.setAuthorname("�ä���");
		String[] a3book = { b4.getBookname() };
		a3.setBooks(a3book);
		a4.setAuthorname("������");
		String[] a4book = { b5.getBookname() };
		a4.setBooks(a4book);
		a5.setAuthorname("�_���");
		String[] a5book = { b6.getBookname() };
		a5.setBooks(a5book);
		Map<String, String> s1books = new HashMap<>();
		Map<String, String> s2books = new HashMap<>();
		s1books.put(b1.getBookname(), b1.getAuthorname());
		s1books.put(b3.getBookname(), b3.getAuthorname());
		s1books.put(b4.getBookname(), b4.getAuthorname());
		s2books.put(b2.getBookname(), b2.getAuthorname());
		s2books.put(b5.getBookname(), b5.getAuthorname());
		s2books.put(b6.getBookname(), b6.getAuthorname());
		s1.setBookauthor(s1books);
		s2.setBookauthor(s2books);
		System.out.println("�п�J�z���W�r");
		User u = new User();
		String username = scanner.next();
		u.setUsername(username);
		Cart cart = new Cart();
		cart.setUsername(u.getUsername());

		StorePortal sp = new StorePortal();
		String[] sns = { s1.getStorename(), s2.getStorename() };
		sp.setStorenames(sns);
		int i = 0, flag = 1;
		Store selectstore = new Store();
		

		while (flag == 1) {
			System.out.println("\n1.��ܮѩ�:\n2.�d�߮��yOR�@��\n3.��J�ѦW�[�J�ʪ���\n��l����h�X�t��\n(�Х���ܮѩ��A�i��2.3�ާ@)\n");
			i = scanner.nextInt();
			switch (i) {
			case 1:
				System.out.println("���H�U�o�Ǯѩ��i�H���:");
				for (String store : sp.getStorenames()) {
					System.out.println(store);
				}
				String storename = scanner.next();
				/* sp.choosestore(storename); */

				if (storename.equals(s1.getStorename())) {
					selectstore.setBookauthor(s1.getBookauthor());
					selectstore.setStorename(s1.getStorename());
					cart.setBookauthor(s1.getBookauthor());
				}
				if (storename.equals(s2.getStorename())) {
					selectstore.setBookauthor(s2.getBookauthor());
					selectstore.setStorename(s2.getStorename());
					cart.setBookauthor(s2.getBookauthor());
				}
				System.out.println("�z���" + selectstore.getStorename() + "��");
				ArrayList<String> storebook = new ArrayList<String>();
				Set<String> storeauthor = new HashSet<String>();
				for (String key : selectstore.getBookauthor().keySet()) {
					String value = selectstore.getBookauthor().get(key);
					storebook.add(key);
					storeauthor.add(value);
				}
				System.out.println("�ѲM��:" + storebook);
				System.out.println("�@�̲M��:" + storeauthor);
				break;
			case 2:
				String nameorauthor = scanner.next();
				selectstore.findbook(nameorauthor);
				break;
			case 3:
				String nameorauthor2 = scanner.next();
				System.out.println(cart.getUsername()+"�z�n");
				cart.addbook(nameorauthor2);
				break;
			default:
				flag = 0;
				break;
			}
		}
	}
}
