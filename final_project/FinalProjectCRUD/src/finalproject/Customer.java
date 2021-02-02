package finalproject;

public class Customer {
	
	private String code;
	private String name;
	private String address;
	private String iban;
	private Person contact;
	private String country;
	
	
	public Customer(String code, String name, Person contact, String country) {
		super();
		this.code = code;
		this.name = name;
		this.contact = contact;
		this.country = country;
	}


	public Customer(String code, String name, String address, String iban, Person contact, String country) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.iban = iban;
		this.contact = contact;
		this.country = country;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getIban() {
		return iban;
	}


	public void setIban(String iban) {
		this.iban = iban;
	}


	public Person getContact() {
		return contact;
	}


	public void setContact(Person contact) {
		this.contact = contact;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
