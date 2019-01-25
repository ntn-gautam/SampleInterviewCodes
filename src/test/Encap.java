package test;

public class Encap {

	private String name;
	
	public void setField(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
Encap en =new Encap();
en.setField("Nitin");

System.out.println(en.getName());
	
	}

}
