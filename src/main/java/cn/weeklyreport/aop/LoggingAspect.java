package cn.weeklyreport.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by greg.chen on 14-9-19.
 */
@Component
@Aspect
public class LoggingAspect {
    private static Logger logger = Logger.getLogger(LoggingAspect.class);

    @Around("execution(* cn.weeklyreport.service..*.*(..))")
    public Object beginTransaction(ProceedingJoinPoint pjp)  throws Throwable{
        Signature signature = pjp.getSignature();
        Object[] args = pjp.getArgs();
        List<String> parameters = new ArrayList<String>();
        if(args != null){
            for(Object o : args){
                StringBuffer sb =  new StringBuffer();

                if(o == null)
                    continue;

                if(o.getClass().getDeclaredFields().length > 0){
                    sb.append(o.getClass().getName() + "{");

                    for(Field field : o.getClass().getDeclaredFields()){
                        field.setAccessible(true);
                        sb.append(field.getName() + ":'" + field.get(o) + "',");
                    }
                    parameters.add(sb.toString());
                }else {
                    parameters.add(o.toString());
                }
            }
        }

        logger.debug(signature.getDeclaringTypeName() + "." + signature.getName() + "(" + parameters + ") start");
        long s = System.currentTimeMillis();
        Object proceed = pjp.proceed(args);
        long e = System.currentTimeMillis();
        logger.debug(signature.getDeclaringTypeName() +
                "." + signature.getName() + " end, elapsed= " +
                ((double)(e-s)) + "ms");
        return proceed;
    }


}
