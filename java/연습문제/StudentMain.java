package Test10;

import java.util.HashMap;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String> hashMap = new HashMap<Student ,String>();
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생 : "+score);

	}

}
