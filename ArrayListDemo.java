import java.util.ArrayList;


public class ArrayListDemo{

	public static void main(String[]args){

		//

	}

	public static ArrayList combine(ArrayList<Integer> a, ArrayList<Integer> b){

		for(int i = 0; i < b.size(); i++)
			a.add(b.get(i));
		return a;

	}

	public static void print(ArrayList<Integer> list){

		for(int i = 0; i < list.size() - 1; i++)
			System.out.print(list.get(i) + ", ");
		System.out.println(list.get(list.size() - 1));

	}

	public static ArrayList removeDuplicates(ArrayList<Integer> list){

		return list;

	}

}