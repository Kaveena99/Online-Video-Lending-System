package borrowVideoModels;

//PlayList.java class for get id,name,type and filename from table playlist in the database to display the play list

public class PlayList {
	
	//declaring variables
	private int id;
	private String name;
	private String type;
	private String filename;
	
	
	//constructor
	public PlayList(int id, String name, String type,String filename) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.filename = filename;
	}

	//get methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	public String getFilename() {
		return filename;
	}

	
	
	
	

}
