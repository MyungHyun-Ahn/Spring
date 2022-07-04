package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // Component 와 같지만 의미를 가지고 있음 @Controller @Service @Repository
public class NewLecExam implements Exam {

    @Value("10") // 기본값 설정
    private int kor;
    @Value("10")
    private int eng;
    @Value("10")
    private int math;
    @Value("10")
    private int com;

    public NewLecExam() {

    }

    public NewLecExam(int kor, int eng, int math, int com) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.com = com;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public int total() {
        return kor + eng + math + com;
    }
    @Override
    public float avg() {
        return total() / 4.0f;
    }

    @Override
    public String toString() {
        return "NewLecExam{" +
                "kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", com=" + com +
                '}';
    }
}
