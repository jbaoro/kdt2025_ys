package ch09.Exam;



public class Anoymous {
    Worker feild = new Worker(){
    @Override 
    public void start(){
        System.out.println("디자인을 합니다");
    }
};
    

    void method1(){
        Worker localVar = new Worker(){
        @Override
        public void start(){
            System.out.println("개발을 합니다");
        }
    };
    localVar.start();
    }
    void method2(Worker worker){
        worker.start();
    }
}
