package customerloginModels;

public class Customer {
	
	private int ID; //data members
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String uName;
	private String password;
	
	public Customer(int ID, String fname, String lname, String email, String phone, String uName, String password) {
		
		this.ID = ID; //constructor
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.uName = uName;
		this.password = password;
	}

	//getters
	public int getID() {
		return ID;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getuName() {
		return uName;
	}

	public String getPassword() {
		return password;
	}
}
