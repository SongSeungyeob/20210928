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
		System.out.printf("�̸� : %s\t| ��ȣ : %s\t| �ּ� : %s\t| ���� : ���嵿��(%s)\n",name, tel, address, company);
//		System.out.println("�̸� : " + name);
//		System.out.println("��ȭ��ȣ : " + tel);
//		System.out.println("�ּ� : " + address);
//		System.out.println("���� : ���嵿��");
	}
	
	public void modify() {
		String tel = Scanutil.readStr(" - ������ FRIEND �� ��ȣ�� �Է��ϼ��� (������ ��ġ ������ '����'�� �Է�) : ");
		String addr = Scanutil.readStr(" - ������ FRIEND �� �ּҸ� �Է��ϼ��� (������ ��ġ ������ '����'�� �Է�) : ");
		String company = Scanutil.readStr(" - ������ FRIEND �� ȸ�縦 �Է��ϼ��� (������ ��ġ ������ '����'�� �Է�) : ");
		
		if(!tel.equals("")) this.tel = tel;
		if(!addr.equals("")) this.address = addr;
		if(!company.equals("")) this.company = company;
	}

}
