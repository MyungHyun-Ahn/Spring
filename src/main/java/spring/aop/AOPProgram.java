package spring.aop;

import spring.aop.entity.Exam;
import spring.aop.entity.NewLecExam;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AOPProgram {
    public static void main(String[] args) {

        Exam exam = new NewLecExam(1, 1, 1, 1);

        Exam proxy = (Exam) Proxy.newProxyInstance(NewLecExam.class.getClassLoader(),
                new Class[]{Exam.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long start = System.currentTimeMillis();

                        Object result = method.invoke(exam, args);

                        long end = System.currentTimeMillis();
                        String message = (end - start) + "ms 시간이 소요";
                        System.out.println(message);

                        return result;
                    }
                }
            );

        System.out.printf("total is %d\n", proxy.total());
        System.out.printf("total is %f\n", proxy.avg());

    }
}
