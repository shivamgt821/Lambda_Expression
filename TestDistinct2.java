import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;

public class TestDistinct2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"Shivam","java"));
		list.add(new Student(1,"Shivam","java"));
		list.add(new Student(1,"Shivam","java"));
		list.add(new Student(2,"Raveesh","ds"));
		list.add(new Student(2,"Raveesh","ds"));
		list.add(new Student(2,"Raveesh","ds"));
		list.add(new Student(3,"Kishore","javaScript"));
		list.add(new Student(4,"Gresshma","sql"));
		list.add(new Student(5,"Joyson","oops"));
		list.add(new Student(5,"Joyson","oops"));
		list.add(new Student(5,"Joyson","oops"));
		list.add(new Student(5,"Joyson","oops"));
		list.add(new Student(5,"Joyson","oops"));
		
		List<Student> list2 = list.stream().distinct().
				collect(Collectors.toList());
		list2.forEach(e->System.out.println(e));
  }
}
