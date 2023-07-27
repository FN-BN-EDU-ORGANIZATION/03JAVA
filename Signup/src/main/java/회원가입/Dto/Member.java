package 회원가입.Dto;

public class Member {
	private String userid;
	private String password;
	private String addr;
	private String role;
	
	public Member() { //3. 기본생성자 생성후 getter,setter 만들기
		//4 dao패키지에 DBConnecter 생성
	}

	public String getUserId() {
		return userid;
	}

	public void setId(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pw) {
		this.password = pw;
	}


	public String getAddress() {
		return addr;
	}

	public void setAddress(String addr) {
		this.addr = addr;	
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	}

