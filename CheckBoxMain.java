package ch09.Exam;

import ch06.package2.C;

public class CheckBoxMain {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();
        checkBox.setOnclickLisnter(new CheckBox.OnSelectListener(){
            @Override
            public void onSelect(){
                System.out.println("배경을 변경합니다");
            }
        });
        checkBox.select();
    }
    
}
