package fan;

import java.sql.Date;

public class Fan {
	private String id;
	private String pw;
	private String name;
	private Date login;
	private Date logout;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLogin() {
		return login;
	}
	public void setLogin(Date login) {
		this.login = login;
	}
	public Date getLogout() {
		return logout;
	}
	public void setLogout(Date logout) {
		this.logout = logout;
	}
	@Override
	public String toString() {
		return "Fan [id=" + id + ", pw=" + pw + ", name=" + name + ", login=" + login + ", logout=" + logout + "]";
	}
	
	
	
	
}
