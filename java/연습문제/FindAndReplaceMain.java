package Test10;

public class FindAndReplaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "자바 개발 가능";
		int index = str.indexOf("자바");
		if(index == -1) {
			System.out.println("자바 x");
		}
		else {
			System.out.println("자바 O");
			str = str.replace("자바", "java");
			System.out.println("--> "+str);
		}

	}

}
