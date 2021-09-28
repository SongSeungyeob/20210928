package co.sy.prj;
import java.util.Scanner;

public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);

	private void mainMenu() {
		System.out.println("* * * * * * * * ");
		System.out.println("== 1. 입력 하기 ==");
		System.out.println("== 2. 수정 하기 ==");
		System.out.println("== 3. 조회 하기 ==");
		System.out.println("== 4. 종료 하기 ==");
		System.out.println("* * * * * * * * ");
		System.out.println("원하는 작업번호를 입력하세요.");
	}
	
	private void firstMenu() {
		System.out.println("==========================");
		System.out.println("* 여기는 '입력' 화면입니다. *");
		System.out.println("* 메인 메뉴는 아무키나 누르세요. *");
		System.out.println("==========================");
		sc.nextLine();
	}
	
	private void secondMenu() {
		System.out.println("==========================");
		System.out.println("* 여기는 '수정' 화면입니다. *");
		System.out.println("* 메인 메뉴는 아무키나 누르세요. *");
		System.out.println("==========================");
		sc.nextLine();
	}
	
	private void thirdMenu() {
		System.out.println("==========================");
		System.out.println("* 여기는 '조회' 화면입니다. *");
		System.out.println("* 메인 메뉴는 아무키나 누르세요. *");
		System.out.println("==========================");
		sc.nextLine();
	}
	
	private void endMenu() {
		System.out.println("===============");
		System.out.println("* GOOD - BYE *");
		System.out.println("===============");
	}
	
	private void doWhileMenu() {
		boolean b = true;
		do {
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine();
			switch(key) {
			case 1:
				firstMenu();
				break;
			case 2:
				secondMenu();
				break;
			case 3:
				thirdMenu();
				break;
			case 4:
				endMenu();
				b = false;
				break;
			}
		}while(b);
	}
	
	public void run() {
		doWhileMenu();
		sc.close();
	}
}
