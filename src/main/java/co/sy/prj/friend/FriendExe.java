package co.sy.prj.friend;

public class FriendExe {
	
	private static FriendExe singleton;
	Friend[] friendArr;
	Scanutil sc = new Scanutil();
	
	private FriendExe() {
		friendArr = new Friend[100];
		friendArr[0] = new SchoolFriend("�۽¿�","1111-2222","�뱸������","�����");
		friendArr[1] = new SchoolFriend("ȫ�浿","2222-3333","����Ư����","������");
		friendArr[2] = new CompanyFriend("���¼�","3333-4444","�뱸������ �߱�","�Ｚ");
		friendArr[3] = new CompanyFriend("�浿ȫ","4444-5555","����Ư���� ���ǵ�","īī��");
	}
	
	public static FriendExe getInstance() {
		singleton = new FriendExe();
		return singleton;
	}
		
	private void Execute() {
		boolean run = true;
		while(run) {
			printTool();
			int Menu = sc.readInt("- �޴��� �����ϼ��� : ");
			switch (Menu) {
			case 1: 
				System.out.println("- FRIEND ��� ������ ���� �ϰڽ��ϴ�. -");
				registerFriend();
				break;
			case 2:
				System.out.println("- FRIEND ��ȸ ������ ���� �ϰڽ��ϴ�. -");
				showInfo();
				break;
			case 3:
				System.out.println("- FRIEND ���� ������ ���� �ϰڽ��ϴ�. -");
				modify();
				break;
			case 4:
				System.out.println("- FRIEND ���� ������ ���� �ϰڽ��ϴ�. -");
				remove();
				break;
			case 5:
				end();
				run = false;
				break;
			}
			System.out.println();
		}
	}
	
	private void end() {
		System.out.println("- �����ϰڽ��ϴ�. -");
	}
	
	private void remove() {
		showInfo();
		int Num = sc.readInt("- ������ ģ���� ��ȣ�� �Է��ϼ��� : ");
		if(friendArr[Num] == null) {
			System.out.println("[ ERROR ] �߸��� �Է��Դϴ�. �������� �ʴ� ģ���� ��ȣ�Դϴ�. ");
		} else {
			friendArr[Num] = null;
			System.out.println("- ���� �Ϸ�Ǿ����ϴ�. ");
		}
	}
	
	private void modify() {
		showInfo();
		int Num = sc.readInt("- ������ ģ���� ��ȣ�� �Է��ϼ��� : ");
		if(friendArr[Num] == null) {
			System.out.println("[ ERROR ] �߸��� �Է��Դϴ�. �������� �ʴ� ģ���� ��ȣ�Դϴ�. ");
		} else {
			friendArr[Num].modify();
			System.out.println("- ���� �Ϸ�Ǿ����ϴ�. ");
		}
	}
	
	private void showInfo() {
		System.out.println("[ FRIEND LIST ] * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
		for(int i = 0 ; i < friendArr.length; i++) {
			if(friendArr[i] == null) continue;
			System.out.print("[" + i + "] ");
			friendArr[i].friendPrint();
		}
		
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
	}
	
	private void registerFriend() {
		int Select;
		while(true) {
			Select = sc.readInt("School Friend ����� '1'��, Company Friend ����� '2'���� �Է��ϼ��� : ");
			if(Select != 1 && Select != 2) {
				System.out.println("[ Error ] �߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			} else {
				break;
			}
		}
		
		String name = sc.readStr("- �̸��� ����ϼ��� : ");
		String tel = sc.readStr("- ��ȣ�� �Է��ϼ��� : ");
		String addr = sc.readStr("- �ּҸ� �Է��ϼ��� : ");
		
		if(Select == 1) {
			String school = sc.readStr("- �б��� �Է��ϼ��� : ");
			Friend schoolFriend = new SchoolFriend(name, tel, addr, school);
			register(schoolFriend);
		} else {
			String company = sc.readStr("- ȸ�縦 �Է��ϼ��� : ");
			Friend companyFriend = new CompanyFriend(name, tel, addr, company);
			register(companyFriend);
		}
		System.out.println("[ FRIEND ��Ͽ� �����ϼ̽��ϴ�. ]");
	}
	
	private void register(Friend F) {
		for(int i = 0 ; i < friendArr.length; i++) {
			if(friendArr[i] == null) {
				friendArr[i] = F;
				break;
			}
		}
	}
	
	private void printTool() {
		System.out.println("[ FRIEND SYSTEM ] �� �� �� �� �� �� �� �� �� ");
		System.out.println("| 1. ���  2. ��ȸ 3. ���� 4. ����  5. ���� |");
		System.out.println("�� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� ��");
	}
	
	public void run() {
		Execute();
	}
}

