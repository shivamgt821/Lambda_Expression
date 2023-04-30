import java.util.List;  
import java.util.stream.Collectors;

public class DistinctNumber {

	public static void main(String[] args) {
		List<Integer> list = List.of(5,47,0,4,5,8,0,0,3,1,1,1,12,1);
		List<Integer> list2 = list.stream().distinct().sorted().
				collect(Collectors.toList());
		System.out.println(list2);
	}

}
