package co.sy.prj;
import co.sy.prj.friend.*;

public class MainApp {
	public static void main(String[] args) {
//		DoWhileTest doWhileTest = new DoWhileTest();
//		doWhileTest.run();
		
//		Animal man = new Man();
//		man.run();
//		man.sleep();
//		
//		Animal bird = new Bird();
//		bird.run();
//		bird.sleep();
		
		
		Friend schoolFriend = new SchoolFriend();
		schoolFriend.name = "ȫ�浿";
		schoolFriend.tel = "010-1111-1111";
		schoolFriend.address = "�뱸������ �߱�";
		schoolFriend.friendPrint();
		
		Friend companyFriend = new CompanyFriend();
		companyFriend.name = "ȫ���";
		companyFriend.tel = "010-2222-2222";
		companyFriend.address = "���ﱤ���� ���α�";
		companyFriend.friendPrint();
	}
}
