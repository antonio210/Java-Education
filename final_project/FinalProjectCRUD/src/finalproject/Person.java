package finalproject;

public class Person {
	
	private String code;
	private String firstName;
	private String lastName;
	private String email;
	private String tel;
	
	
	public Person(String code, String firstName, String lastName) {
		super();
		this.code = code;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Person(String code, String firstName, String lastName, String email, String tel) {
		super();
		this.code = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.tel = tel;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	

	

}
