
public class Phone {
	String company;
	int cost;
	String colour;
	String processor;
	String camerapixel;
	String ram;
	String storage;
	String connectivity;
	String disply;
	String os;
	void phonecharged() {
		System.out.println(company+" phone is fully charged");
	}
	void phoneoff() {
		System.out.println(company+"Phone is Switch off");
	}
	public Phone(String company, int cost, String colour, String processor, String camerapixel, String ram,
			String storage, String connectivity, String disply, String os) {
		super();
		this.company = company;
		this.cost = cost;
		this.colour = colour;
		this.processor = processor;
		this.camerapixel = camerapixel;
		this.ram = ram;
		this.storage = storage;
		this.connectivity = connectivity;
		this.disply = disply;
		this.os = os;
	}
}
