package co.sy.prj.friend;

public class CompanyFriend extends Friend {

	public String company;
	
	public CompanyFriend() {
		
	}
	
	public CompanyFriend(String name, String tel, String address, String company) {
		super(name, tel, address);
		this.company = company;
	}
	
	@Override
	public void friendPrint() {
		System.out.printf("이름 : %s\t| 번호 : %s\t| 주소 : %s\t| 구분 : 직장동료(%s)\n",name, tel, address, company);
//		System.out.println("이름 : " + name);
//		System.out.println("전화번호 : " + tel);
//		System.out.println("주소 : " + address);
//		System.out.println("구분 : 직장동료");
	}
	
	public void modify() {
		String tel = Scanutil.readStr(" - 수정할 FRIEND 의 번호를 입력하세요 (수정을 원치 않으면 '엔터'를 입력) : ");
		String addr = Scanutil.readStr(" - 수정할 FRIEND 의 주소를 입력하세요 (수정을 원치 않으면 '엔터'를 입력) : ");
		String company = Scanutil.readStr(" - 수정할 FRIEND 의 회사를 입력하세요 (수정을 원치 않으면 '엔터'를 입력) : ");
		
		if(!tel.equals("")) this.tel = tel;
		if(!addr.equals("")) this.address = addr;
		if(!company.equals("")) this.company = company;
	}

}
