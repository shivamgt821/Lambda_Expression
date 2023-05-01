import java.util.List; 
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Testsorted2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"Shivam","java"));
		list.add(new Student(2,"Raveesh","ds"));
		list.add(new Student(3,"Kishore","javaScript"));
		list.add(new Student(4,"Gresshma","sql"));
		list.add(new Student(5,"Joyson","oops"));

		List<Student> list2 = Testsorted3.sortByName(list);
		list2.forEach(e-> System.out.println(e));
		System.out.println("**********************************************");
		
	
		List<Student> list3 = Testsorted3.sortByCour(list);
		list3.forEach(e-> System.out.println(e));

	}
}
