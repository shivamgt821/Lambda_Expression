import java.util.List;
import java.util.stream.Collectors;

public class Testsorted1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(5,47,0,4,5,8,65,3,2,1); // we cant store delete add in listof method
		List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);
	}
}
