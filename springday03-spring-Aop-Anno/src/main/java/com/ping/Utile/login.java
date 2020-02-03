package com.ping.Utile;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//用于记录日志工具类，提供公共代码
@Component("log")
@Aspect
public class login {
    @Pointcut("execution(* *..*.*(..))")
    private  void pt1(){ }
    //打印日志，切入点执行前执行
    @Before("pt1()")
    public  void Beforeprintlog(){
        System.out.println("前置通知login中printlog方法开始执行日志");
    }
    @AfterReturning("pt1()")
    public  void AfterCommitprintlog(){
        System.out.println("后置通知login中printlog方法开始执行日志");
    }
    @AfterThrowing("pt1()")
    public  void AfterThrowprintlog(){
        System.out.println("异常通知login中printlog方法开始执行日志");
    }
   @After("pt1()")
    public  void AfterprintLog(){
        System.out.println("最终通知login中printlog方法开始执行日志");
    }
    /*@Around("pt1()")
    public void arrountPrintLog(){
        System.out.println("环绕通知login中printlog方法开始执行日志");
    }*/
}
