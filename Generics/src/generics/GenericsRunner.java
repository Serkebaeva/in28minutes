package generics;

public class GenericsRunner {
	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");

		System.out.println(list);
		String value = list.get(0);
		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));

		System.out.println(list2);
		Integer number = list2.get(0);
		System.out.println(number);
	}
}
