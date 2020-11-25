import java.sql.Date;

public class BaseballDTO {
	private int num;
	private String name;
	private Date build;
	private String image;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBuild() {
		return build;
	}
	public void setBuild(Date build) {
		this.build = build;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "BaseballDTO [num=" + num + ", name=" + name + ", build=" + build + ", image=" + image + "]";
	}
	
		
}
