package co.sy.prj.friend;

public class FriendExe {
	
	private static FriendExe singleton;
	Friend[] friendArr;
	Scanutil sc = new Scanutil();
	
	private FriendExe() {
		friendArr = new Friend[100];
		friendArr[0] = new SchoolFriend("송승엽","1111-2222","대구광역시","서울대");
		friendArr[1] = new SchoolFriend("홍길동","2222-3333","서울특별시","연세대");
		friendArr[2] = new CompanyFriend("엽승송","3333-4444","대구광역시 중구","삼성");
		friendArr[3] = new CompanyFriend("길동홍","4444-5555","서울특별시 여의도","카카오");
	}
	
	public static FriendExe getInstance() {
		singleton = new FriendExe();
		return singleton;
	}
		
	private void Execute() {
		boolean run = true;
		while(run) {
			printTool();
			int Menu = sc.readInt("- 메뉴를 선택하세요 : ");
			switch (Menu) {
			case 1: 
				System.out.println("- FRIEND 등록 과정을 진행 하겠습니다. -");
				registerFriend();
				break;
			case 2:
				System.out.println("- FRIEND 조회 과정을 진행 하겠습니다. -");
				showInfo();
				break;
			case 3:
				System.out.println("- FRIEND 수정 과정을 진행 하겠습니다. -");
				modify();
				break;
			case 4:
				System.out.println("- FRIEND 삭제 과정을 진행 하겠습니다. -");
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
		System.out.println("- 종료하겠습니다. -");
	}
	
	private void remove() {
		showInfo();
		int Num = sc.readInt("- 삭제할 친구의 번호를 입력하세요 : ");
		if(friendArr[Num] == null) {
			System.out.println("[ ERROR ] 잘못된 입력입니다. 존재하지 않는 친구의 번호입니다. ");
		} else {
			friendArr[Num] = null;
			System.out.println("- 삭제 완료되었습니다. ");
		}
	}
	
	private void modify() {
		showInfo();
		int Num = sc.readInt("- 수정할 친구의 번호를 입력하세요 : ");
		if(friendArr[Num] == null) {
			System.out.println("[ ERROR ] 잘못된 입력입니다. 존재하지 않는 친구의 번호입니다. ");
		} else {
			friendArr[Num].modify();
			System.out.println("- 수정 완료되었습니다. ");
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
			Select = sc.readInt("School Friend 등록은 '1'번, Company Friend 등록은 '2'번을 입력하세요 : ");
			if(Select != 1 && Select != 2) {
				System.out.println("[ Error ] 잘못된 입력입니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}
		
		String name = sc.readStr("- 이름을 등록하세요 : ");
		String tel = sc.readStr("- 번호를 입력하세요 : ");
		String addr = sc.readStr("- 주소를 입력하세요 : ");
		
		if(Select == 1) {
			String school = sc.readStr("- 학교를 입력하세요 : ");
			Friend schoolFriend = new SchoolFriend(name, tel, addr, school);
			register(schoolFriend);
		} else {
			String company = sc.readStr("- 회사를 입력하세요 : ");
			Friend companyFriend = new CompanyFriend(name, tel, addr, company);
			register(companyFriend);
		}
		System.out.println("[ FRIEND 등록에 성공하셨습니다. ]");
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
		System.out.println("[ FRIEND SYSTEM ] ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ");
		System.out.println("| 1. 등록  2. 조회 3. 수정 4. 삭제  5. 종료 |");
		System.out.println("ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
	}
	
	public void run() {
		Execute();
	}
}

