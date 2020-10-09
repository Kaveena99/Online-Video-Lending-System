package requestVideoModels;

public class requestlist {

	private int id;
	private String videoname; 
	private String vtype;
	private String usname;
	public requestlist(int id, String videoname, String vtype, String usname) {
		
		this.id = id;
		this.videoname = videoname;
		this.vtype = vtype;
		this.usname = usname;
	}
	public int getId() {
		return id;
	}
	
	public String getVideoname() {
		return videoname;
	}
	
	public String getVtype() {
		return vtype;
	}
	
	public String getUsname() {
		return usname;
	}
	
	
	
}
