package 회원가입.vo;

//1. DB에서 기본 tbl을 만들기
//그리드(편집모드) : ART + SHIFT + A
//커서는 shift + 방향키로 여러개 선택 후 한번에 적용 가능 
public class UserVo {
	//2. db에서 만든 tbl 연결하기
	private int num;
	private String id;
	private String name;
	private String password;
	private String gender;
	private String zipcode;
	private String address;
	private String address_detail;
	private String address_etc;
	
	
	public UserVo() { //3. 기본생성자 생성후 getter,setter 만들기
		//4 dao패키지에 DBConnercer 생성
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

	public String getAddress_etc() {
		return address_etc;
	}

	public void setAddress_etc(String address_etc) {
		this.address_etc = address_etc;
	}
}
