import java.util.ArrayList;
import java.util.List;

	public class AddParralelValuesByForEach2 {
		
		public static void main(String[] args) {
			List<Integer> values  = new ArrayList<Integer>();
			for(int i=1; i<=100; i++) {
				values.add(i);
			}
			values.parallelStream().forEach(System.out::println);  
		}

	}
