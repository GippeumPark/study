package service;

import domain.User;

public interface UserService {
	//어떤 데이터를 입력받아서 결과를 어떤 종류의 데이터 타입으로 리턴
	
	//회원가입 - 데이터 추가 : Create
	//회원정보 전체를 받아서 성공 여부를 리턴
	public boolean join(User user);
	
	//회원 정보 보기 - 데이터 확인 : Read
	//데이터를 상세하게 보기 위해 데이터를 가져올 떄는 primary key(구별할 수 있는 데이터)의 값을 입력받아서
	//전체 정보를 리턴
	public User read(String id);

	
	//회원정보 수정 - 데이터 수정 : Update
	//회원정보 전체를 입력받아서 성공 여부를 리턴
	public boolean edit(User user);

	
	//회원 탈퇴 - 데이터 삭제 : Delete
	//기본키를 입력받아서 성공 여부를 리턴
	public boolean delete(String id);

	
	//로그인 - 데이터 확인 : Read
	//회원정보를 입력받아서 회원정보를 리턴
	//로그인은 성공을 하면 회원정보 전체를 가져와야 함
	public User login(User user);

	
	//로그아웃 - 데이터 작업을 수행하지 않음
	//로그아웃은 입력 데이터 없이 성공 여부만 리턴
	public boolean logout();

	
}
