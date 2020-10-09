package requestVideoModels;



public class requestvideo {

	private int id;
	private String videoname; 
	private String vtype;
	private String video;
	private String filename;
	private String trailer;
	private String trailerfile;
	
	public requestvideo(int id, String videoname, String vtype,String video,String filename,String trailer,String trailerfile) {
		
		this.id = id;
		this.videoname = videoname;
		this.vtype = vtype;
		this.video=video;
		this.filename = filename;
		this.trailer=trailer;
		this.trailerfile =trailerfile;
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
