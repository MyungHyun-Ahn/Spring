package spring.aop.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

public class NewLecExam implements Exam {
    private int kor;
    private int eng;
    private int math;
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
        // long start = System.currentTimeMillis();



        int result = kor + eng + math + com;

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // long end = System.currentTimeMillis();

        // String message = (end - start) + "ms 시간이 소요";
        // System.out.println(message);

        return result;
    }
    @Override
    public float avg() {

        float result = total() / 4.0f;

        return result;
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
