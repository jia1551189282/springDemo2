package com.domain;





import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class MyAspect  implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法执行之前=================");

        Object proceed = methodInvocation.proceed();

        System.out.println("方法执行之后====================");

        return proceed;
    }
}
