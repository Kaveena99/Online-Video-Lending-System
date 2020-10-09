package borrowVideoModels;

//Play.java class for get id,name,type and filename from table playlist in the database to play the selected video

public class Play {
	
	//declaring variables
	private int id;
	private String name;
	private String type;
	private String filename;
	
	//overloaded constructor
	public Play(int id, String name, String type, String filename) {
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
