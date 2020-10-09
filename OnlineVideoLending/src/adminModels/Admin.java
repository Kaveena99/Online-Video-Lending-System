package adminModels;

public class Admin {
	
	private int id; //data members
	private String uName;
	private String password;

	public Admin(int id, String uName, String password) { //constructor
		
		this.id = id;
		this.uName = uName;
		this.password = password;
	}

	//getters
	public int getID() {
		return id;
	}
	
	public String getuName() {
		return uName;
	}

	public String getPassword() {
		return password;
	}

}
