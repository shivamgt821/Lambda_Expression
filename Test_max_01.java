import java.util.List;  
import java.util.ArrayList;

public class Test_max_01 {

	public static void main(String[] args) {
		
//		List<Integer> list = List.of(3,4,98,56,25,84);
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(45);
		list.add(40);
		list.add(1);
		list.add(6);
		list.add(96);
		list.add(10);
		list.add(3);
		
		Integer max = list.stream().max((e1,e2)->e1 - e2).get();
		System.out.println(max);
	}
}
