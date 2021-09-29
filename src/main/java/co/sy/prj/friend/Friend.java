package co.sy.prj.friend;

public abstract class Friend {
	public String name;
	public String tel;
	public String address;
	
	public Friend() {
		
	}
	
	public Friend(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public abstract void friendPrint();
	public abstract void modify();
}
