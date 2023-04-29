import java.util.List; 
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		
		List<Student> l = new ArrayList<>();
		
		l.add(new Student(1,"Shivam","java"));
		l.add(new Student(2,"suRya","data structure"));
		l.add(new Student(3,"Rudra","bootstrap"));
		l.add(new Student(4,"Tp","html"));
		l.add(new Student(5,"Kishore","css"));
		l.add(new Student(6,"GreeshmA","sql"));
	
    List<Student> list2 = l.stream().map(e->{e.setName(e.getName().toLowerCase());
    e.setCourse(e.getCourse().toUpperCase());
    return e;
    }).collect(Collectors.toList());
    for(Student s:l) System.out.println(s);
    }
}

import java.util.List; 
import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private String Course;
	public Student(int id, String name, String course) {
		
		this.id = id;
		this.name = name;
		Course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Course=" + Course + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Course, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Course, other.Course) && id == other.id && Objects.equals(name, other.name);
	}
}
