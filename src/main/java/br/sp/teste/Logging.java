package br.sp.teste;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    // first rule for method annotation, second - for class
    @Pointcut("@annotation(Log)")
    public void execute() {}

    @Before("execute()")
    public void executeBefore() {
        System.out.println("Entered " + Thread.currentThread().getStackTrace()[2].getMethodName());
    }
}
