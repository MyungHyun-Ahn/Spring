package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
    @Autowired(required = false)
    @Qualifier("exam1")
    private Exam exam;

    public InlineExamConsole() { // 기본 생성자가 없을 시 오류 (생성자를 모두 없애면 컴파일러가 생성자 자동 생성)
        System.out.println("constructor");
    }
    /*@Autowired
    public InlineExamConsole(
            *//*@Qualifier("exam1")*//* Exam exam1,
            *//*@Qualifier("exam2")*//* Exam exam2) {
        System.out.println("overload constructor");
        this.exam = exam1;
    }*/
    @Override
    public void print() {
        if (exam == null)
            System.out.printf("total is %d, avg is %f\n", 0, 0.0);
        else
            System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
    }

    /*@Autowired
    @Qualifier("exam1")*/ // 무엇을 기준으로 인젝션
    @Override
    public void setExam(Exam exam) {
        System.out.println("setter");
        this.exam = exam;
    }
}
