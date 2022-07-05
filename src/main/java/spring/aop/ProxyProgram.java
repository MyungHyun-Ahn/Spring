package spring.aop;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyProgram {
    public static void main(String[] args) {
        Exam exam = new NewLecExam();
        Exam examProxy = (Exam) Proxy.newProxyInstance(
            NewLecExam.class.getClassLoader(),
            new Class[]{Exam.class},
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    long start = System.currentTimeMillis();
                    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                    String str = dayTime.format(new Date(start));
                    System.out.println(str);
                    /*--------------------------*/
                    Object result = method.invoke(exam, args);
                    /*--------------------------*/
                    long end = System.currentTimeMillis();
                    String message = (end - start) + "ms가 걸림";
                    System.out.println(message);
                    return result;
                }
            });
            int result = examProxy.total();
            System.out.println("total is " + result);

    }
}
