package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
    private Exam exam;

    public GridExamConsole() {

    }
    public GridExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");

    }

    @Autowired
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
