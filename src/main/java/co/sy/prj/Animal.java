package co.sy.prj;

/*
 * 추상 Class는 자기 자신을 instance로 생성할 수가 없다.
 * ex) Animal animal = new Animal() 이게 안된다.
 */

public abstract class Animal {
	public abstract void run();
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
}
