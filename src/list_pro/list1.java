package list_pro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list1{
	public static void main(String[] args) {
		System.out.println("hello");
		List<Integer> int1 = new ArrayList<>();
		int1.add(11);
		int1.add(12);
		int1.add(13);
		int1.add(14);
		int1.add(15);
		Set<Integer>set1=new HashSet<>(int1);
		for (Object re : set1)
		{
			System.out.println(re);
		}
	}

}
