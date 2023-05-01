import java.util.List;  
import java.util.stream.Collectors;
 
public class Testsorted3 {

	public static List<Student> sortByName(List<Student>list)
	{
		return  list.stream().sorted((e,o) ->{
			return e.getName().compareToIgnoreCase(o.getName());
		}).collect(Collectors.toList());
	}
	public static List<Student> sortByCour(List<Student>list)
	{
		return list.stream().sorted((e,o) ->{
			return e.getCourse().compareToIgnoreCase(o.getName());
		}).collect(Collectors.toList());
	}
	

}
