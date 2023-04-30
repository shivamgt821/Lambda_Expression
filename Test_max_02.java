import java.util.List;  
import java.util.ArrayList;

public class Test_max_02 {

	public static void main(String[] args) {

		List<Student> l = new ArrayList<>();
		l.add(new Student(1,"Shivam","java"));
		l.add(new Student(2,"suRya","data structure"));
		l.add(new Student(3,"Rudra","bootstrap"));
		l.add(new Student(4,"Tp","html"));
		l.add(new Student(5,"Kishore","css"));
		l.add(new Student(3,"GreeshmA","sql"));
		
		Object max = l.stream().max((e1,e2)->{
			return e1.getName().compareToIgnoreCase(e2.getName());
		}).get();
		
		Object max1 = l.stream().max((e1,e2)->{
			return e1.getCourse().compareToIgnoreCase(e2.getCourse());
		}).get();
		
		Object max2 = l.stream().max((e1,e2)->{
			return e1.getId()-e2.getId();
		}).get();
		
		Object max3 = l.stream().max((e1,e2)->{
			return e1.toString().compareToIgnoreCase(e2.toString());
		}).get();
		
		System.out.println(max);
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
	}

}
