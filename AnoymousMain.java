package ch09.Exam;

public class AnoymousMain {
    public static void main(String[] args) {
        Anoymous anony = new Anoymous();
        anony.feild.start();
        anony.method1();
        anony.method2(new Worker(){
            @Override
            public void start(){
                System.out.println("테스트를 합니다");
            }
        });
    }
    
}
