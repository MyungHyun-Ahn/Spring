package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.aop.entity.Exam;
import spring.aop.entity.NewLecExam;
import spring.di.NewlecDIConfig;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AOPProgram {
    public static void main(String[] args) {

        ApplicationContext context =
                // new AnnotationConfigApplicationContext(NewlecDIConfig.class);
                new ClassPathXmlApplicationContext("setting.xml");

        Exam proxy = (Exam) context.getBean("proxy");

        System.out.printf("total is %d\n", proxy.total());
        System.out.printf("avg is %f\n", proxy.avg());
        /*
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
            */

    }
}
