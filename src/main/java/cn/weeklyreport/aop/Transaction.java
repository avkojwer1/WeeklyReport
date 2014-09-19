package cn.weeklyreport.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by greg.chen on 14-9-19.
 */
@Component
@Aspect
public class Transaction {

    @Before("execution(* cn.weeklyreport.service..*.*(..))")
    public void beginTransaction(){
        System. out.println( "begin transaction");
    }


}
