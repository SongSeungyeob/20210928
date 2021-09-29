package co.sy.prj.friend;

public class SchoolFriend extends Friend {

	String school;
	
	public SchoolFriend() {
		
	}
	
	public SchoolFriend(String name, String tel, String address, String school) {
		super(name, tel, address);
		this.school = school;
	}
	
	@Override
	public void friendPrint() {
		System.out.printf("이름 : %s\t| 번호 : %s\t| 주소 : %s\t| 구분 : 학교친구(%s)\n",name, tel, address, school);
	}
	
	public void modify() {
		String tel = Scanutil.readStr(" - 수정할 FRIEND 의 번호를 입력하세요 (수정을 원치 않으면 '엔터'를 입력) : ");
		String addr = Scanutil.readStr(" - 수정할 FRIEND 의 주소를 입력하세요 (수정을 원치 않으면 '엔터'를 입력) : ");
		String school = Scanutil.readStr(" - 수정할 FRIEND 의 학교를 입력하세요 (수정을 원치 않으면 '엔터'를 입력) : ");
		
		if(!tel.equals("")) this.tel = tel;
		if(!addr.equals("")) this.address = addr;
		if(!school.equals("")) this.school = school;
	}

}
