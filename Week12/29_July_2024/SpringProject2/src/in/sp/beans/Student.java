package in.sp.beans;



public class Student {
	
    private String name;
	private int rollno;           
	private Address address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Address setter method is called");
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("Name: "+ name);
		System.out.println("Rollno: "+ rollno);
		System.out.println("Address: "+address );
		
	}
}



// Constructor Method



//public class Student {
//	
//    private String name;
//	private int rollno;           
//	private Address address;
//	
//	
//	public Strundet(String name,int rollno, Address address) {
//		
//		this.name = name;
//		this.rollno = rollno;
//		this.address = address;
//	}
//	public void display() {
//		
//		System.out.println("Name: "+ name);
//		System.out.println("Rollno: "+ rollno);
//		System.out.println("Address: "+address );
//		
//	}
//}