package com.byteprofile;

import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class TimerInterceptor {
    @RuntimeType
    public static Object intercept(@Origin Method method,
                                   @SuperCall Callable<?> callable) {
        long start = System.currentTimeMillis();
        try {
            return callable.call(); //<-------
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("\033[1;33m" + method.getName() + " took " + (System.currentTimeMillis() - start) + " mils" + "\033[0m");
        }
        return null;
    }
}
