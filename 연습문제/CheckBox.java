package ch09.Exam;

public class CheckBox {
    OnSelectListener lisnter;

    void setOnclickLisnter(OnSelectListener lisnter){
        this.lisnter=lisnter;
    }
    void select(){
        lisnter.onSelect();
    }
    static interface  OnSelectListener {
        void onSelect();
    }
    
}
