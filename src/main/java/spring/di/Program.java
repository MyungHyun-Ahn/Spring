package spring.di;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;
import spring.di.ui.ExamConsole;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) throws BeansException {
        /* 스프링 지시자를 지정
        Exam exam = new NewLecExam();
        ExamConsole console = new GridExamConsole();

        console.setExam(exam);
        */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("setting.xml");
        // ExamConsole console = (ExamConsole) context.getBean("console");
        // Exam exam = context.getBean(Exam.class);
        // System.out.println(exam.toString());
        ExamConsole console = (ExamConsole) context.getBean("console");
        // ExamConsole console = context.getBean(ExamConsole.class);
        console.print();

       /*
       List<Exam> exams = (List<Exam>) context.getBean("exams");
        // exams.add(new NewLecExam(1,1,1,1));

        for(Exam e : exams)
            System.out.println(e);
       */
    }
}

