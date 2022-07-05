package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable { // 어떤것을 처리하냐에 따라 예외처리
        // 예외처리 로직
        System.out.println("예외가 발생하였습니다.: " + e.getMessage());
    }
}
