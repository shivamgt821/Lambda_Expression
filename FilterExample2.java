import java.util.ArrayList;
import java.util.List;

public class FilterExample2 {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			values.add(i);
		}
		values.stream().filter(i -> {
			System.out.println("hi");  
			return true;
		}).findFirst();  // optional value , Stream once use can not be reuse
//		}).findFirst().orElse(0);   // optional value , Stream once use can not be reuse
		}
	}

