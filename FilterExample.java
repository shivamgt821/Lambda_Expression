import java.util.ArrayList;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List <Integer> values = new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			values.add(i);
		}
		values.stream().filter(i -> {
			System.out.println("hi");  // Successfully Compiled and run but no output
			return true;
		});
	}

}
