package com.tw.aop.annotation;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class MetricAdvisor extends AbstractPointcutAdvisor {
    public static final long serialVersionUID = 1L;

    private final StaticMethodMatcherPointcut pointcut = new StaticMethodMatcherPointcut() {
        public boolean matches(Method method, Class<?> aClass) {
            return method.isAnnotationPresent(Metric.class);
        }
    };

    @Autowired
    private MetricInterceptor interceptor;

    public Pointcut getPointcut() {
        return this.pointcut;
    }

    public Advice getAdvice() {
        return this.interceptor;
    }
}
