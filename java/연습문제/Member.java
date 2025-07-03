package Test10;

public class Member {
	String id;
	String name;
	
	public Member(String id , String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id + ": " +name;
	}

}
