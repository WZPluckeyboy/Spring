package com.ping.Utile;
//用于记录日志工具类，提供公共代码
public class login {
    //打印日志，切入点执行前执行
    public  void Beforeprintlog(){
        System.out.println("前置通知login中printlog方法开始执行日志");
    }
    public  void AfterCommitprintlog(){
        System.out.println("后置通知login中printlog方法开始执行日志");
    }
    public  void AfterThrowprintlog(){
        System.out.println("异常通知login中printlog方法开始执行日志");
    }
    public  void AfterprintLog(){
        System.out.println("最终通知login中printlog方法开始执行日志");
    }
    public void arrountPrintLog(){
        System.out.println("环绕通知login中printlog方法开始执行日志");
    }
}
