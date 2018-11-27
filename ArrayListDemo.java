import java.util.ArrayList;


public class ArrayListDemo{

	public static void main(String[]args){

		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 1; i <= 10; i++)
			a.add(i);
		print(a);

		ArrayList<Integer> b = new ArrayList<>();
		for(int i = 6; i <= 15; i++)
			b.add(i);
		print(b);

		ArrayList<Integer> c = combine(a, b);
		print(c);

		ArrayList<Integer> d = removeDuplicates(c);
		print(d);

	}

	public static ArrayList<Integer> combine(ArrayList<Integer> a, ArrayList<Integer> b){

		for(int i = 0; i < b.size(); i++)
			a.add(b.get(i));
		return a;

	}

	public static void print(ArrayList<Integer> list){

		for(int i = 0; i < list.size() - 1; i++)
			System.out.print(list.get(i) + ", ");
		System.out.println(list.get(list.size() - 1));

	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){

		return list;

	}

}