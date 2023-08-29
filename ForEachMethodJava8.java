import java.util.Arrays;
import java.util.List;

// forEach Methods in java8
// External Loops
// Internal Loops
public class ForEachMethodJava8 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,3,6,7,8);
//		for(int i=0; i<values.size(); i++) {
//			System.out.println(values.get(i));
//		}
//		for(int n : values) System.out.println(n);
		
		values.forEach(i -> System.out.println(i));
	}

}
