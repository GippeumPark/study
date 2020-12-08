package hospital;

import java.util.Date;

public class Hospital {

	//병원명(문자열), 위치(문자열), 진료비(정수), 개업일(날짜)
	//1. 내용 작성
	private String hospitalname;
	private String hospitalplace;
	private int	hospitalprice;
	private Date hospitalbuilddate;
	
	//매개변수가 없는 생성자 - default Constructor
	//2. Generate Constructor from Superclass
	public Hospital() {
		super();
		
	}
	
	//매개변수로 데이터를 받아서인스턴스 변수를 설정하는 생성자
	//외부로 데이터를 받아서 설정하는 것을 주입(Injection)
	//3. Generate Constructor Using Feilds
	public Hospital(String hospitalname, String hospitalplace, int hospitalprice, Date builddate) {
		super();
		this.hospitalname = hospitalname;
		this.hospitalplace = hospitalplace;
		this.hospitalprice = hospitalprice;
		this.hospitalbuilddate = builddate;
	}

	//getters & setters	 - 접근자 메소드
	//4. Generate getters and setters
	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	public String getHospitalplace() {
		return hospitalplace;
	}

	public void setHospitalplace(String hospitalplace) {
		this.hospitalplace = hospitalplace;
	}

	public int getHospitalprice() {
		return hospitalprice;
	}

	public void setHospitalprice(int hospitalprice) {
		this.hospitalprice = hospitalprice;
	}

	public Date getHospitalbuilddate() {
		return hospitalbuilddate;
	}

	public void setHospitalbuilddate(Date hospitalbuilddate) {
		this.hospitalbuilddate = hospitalbuilddate;
	}

	//각 속성의 값을 빠르게 확인하기 위한 메소드
	//5. toString
	@Override
	public String toString() {
		return "Hospital [hospitalname=" + hospitalname + ", hospitalplace=" + hospitalplace + ", hospitalprice="
				+ hospitalprice + ", hospitalbuilddate=" + hospitalbuilddate + "]";
	}
	
}
