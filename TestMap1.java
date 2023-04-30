import java.util.stream.Collectors; 
import java.util.List;
import java.util.function.Function;

public class TestMap1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(8,6,5,7,3,2,4,7,665,4);
		
		Function<Integer, String> fun = new Function<Integer, String>(){
			@Override
			public String apply(Integer t) {
				return t * t + "";
			}
		};
		
		List<String> list2 = list.stream().map(fun).collect(Collectors.toList());
		
		
//		List<Integer> list2 = list.stream().map(e->e*e).collect(Collectors.toList());
		
		System.out.println(list2);
	}
}
