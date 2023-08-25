import java.util.ArrayList;
import java.util.List;

public class Add100ValuesByForEach {
	
	public static void main(String[] args) {
		List<Integer> values  = new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			values.add(i);
		}
//		for(int i : values) {
//			System.out.println(i);     // 1st way
//		}
//		values.forEach(System.out::println);     // 2nd way
		values.stream().forEach(System.out::println);  // 3rd way
//		values.parallelStream().forEach(System.out::print);  
	}

}
