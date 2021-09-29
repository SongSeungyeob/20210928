package co.sy.prj.friend;
import java.util.Scanner;

public class Scanutil {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String readStr(String msg) {
		System.out.print(msg);
		String inputData = sc.nextLine(); 
		return inputData;
	}
	
	public int readInt(String msg) {
		System.out.print(msg);
		int inputData = sc.nextInt(); sc.nextLine();
		return inputData;
	}
}
