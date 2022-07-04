package spring.di.entity;

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
