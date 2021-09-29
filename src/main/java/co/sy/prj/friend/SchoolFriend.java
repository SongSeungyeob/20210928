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
		System.out.printf("�̸� : %s\t| ��ȣ : %s\t| �ּ� : %s\t| ���� : �б�ģ��(%s)\n",name, tel, address, school);
	}
	
	public void modify() {
		String tel = Scanutil.readStr(" - ������ FRIEND �� ��ȣ�� �Է��ϼ��� (������ ��ġ ������ '����'�� �Է�) : ");
		String addr = Scanutil.readStr(" - ������ FRIEND �� �ּҸ� �Է��ϼ��� (������ ��ġ ������ '����'�� �Է�) : ");
		String school = Scanutil.readStr(" - ������ FRIEND �� �б��� �Է��ϼ��� (������ ��ġ ������ '����'�� �Է�) : ");
		
		if(!tel.equals("")) this.tel = tel;
		if(!addr.equals("")) this.address = addr;
		if(!school.equals("")) this.school = school;
	}

}
