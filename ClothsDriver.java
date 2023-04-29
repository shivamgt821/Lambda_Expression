import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class ClothsDriver {

	public static void main(String[] args) {
		List<Cloths> clist = new ArrayList<Cloths>();
		clist.add(new Cloths(1,"Shirt", "netpay"));
		clist.add(new Cloths(2,"Trouser", "Raymonds"));
		clist.add(new Cloths(3,"Shorts", "nike"));
		clist.add(new Cloths(4,"t-Shirt", "puma"));
		
		Collections.sort(clist,(e1,e2)->{
			return e1.getType().compareToIgnoreCase(e2.getType());
		});
		
		
		for(Cloths c: clist) System.out.println(c);
	}
}

public class Cloths {
	
	private int id;
	private String type;
	private String brand;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Cloths(int id, String type, String brand) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Cloths [id=" + id + ", type=" + type + ", brand=" + brand + "]";
	}
}
