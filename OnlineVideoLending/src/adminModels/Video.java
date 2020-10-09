package adminModels;

//Video class for get id,name,type,video,filename from table video of the database
public class Video {
	
	private int id; //data members
	private String name;
	private String type;
	private String video;
	private String filename;
	private String trailer;
	private String trailerfile;
	
	//constructor
	public Video(int id, String name, String type, String video, String filename,String trailer,String trailerfile) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.video = video;
		this.filename = filename;
		this.trailer = trailer;
		this.trailerfile = trailerfile;
		
	}

	//getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getVideo() {
		return video;
	}
	
	public String getFilename() {
		return filename;
	}

	public String getTrailer() {
		return trailer;
	}

	public String getTrailerfile() {
		return trailerfile;
	}
	

}
