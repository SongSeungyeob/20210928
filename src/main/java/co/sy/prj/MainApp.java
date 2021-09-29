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
		schoolFriend.name = "È«±æµ¿";
		schoolFriend.tel = "010-1111-1111";
		schoolFriend.address = "´ë±¸±¤¿ª½Ã Áß±¸";
		schoolFriend.friendPrint();
		
		Friend companyFriend = new CompanyFriend();
		companyFriend.name = "È«±æ¼ø";
		companyFriend.tel = "010-2222-2222";
		companyFriend.address = "¼­¿ï±¤¿ª½Ã Á¾·Î±¸";
		companyFriend.friendPrint();
	}
}
