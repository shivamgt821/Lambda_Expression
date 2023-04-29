import java.util.List;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarDriver {

	public static void main(String[] args) {
		List<Car> clist = new ArrayList<>();
		clist.add(new Car(1,"Mustang","Ford"));
		clist.add(new Car(2,"F-150 Raptor","Ford"));
		clist.add(new Car(3,"Cobra GT","Nissan"));
		clist.add(new Car(4,"350 z","Ford"));
		clist.add(new Car(5,"Supra","Toyota"));
		clist.add(new Car(6,"Skyline","Nissan"));
		
    // Ananomous class implementation by using lambda function
		Comparator <Car> com = (e1,e2)-> {
			return e1.getName().compareToIgnoreCase(e2.getName());
		};
		Collections.sort(clist,com);
		clist.forEach(e->System.out.println(e));
//		clist.forEach(System.out:: println);  2nd syntax of forEach loop

	}

}


public class Car {
	private int id;
	private String name;
	private String brand;
	
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Car(int id, String name, String brand) {
		
		this.id = id;
		this.name = name;
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", brand=" + brand + "]";
	}	
}


