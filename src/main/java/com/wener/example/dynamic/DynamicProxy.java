package com.wener.example.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


// 第一步  定义代理类,实现InvocationHandler接口
public class DynamicProxy implements InvocationHandler {
    //代理目标对象
    private Object target;

    public Object newProxyInstance(Object object) {
        this.target = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader()
                , object.getClass().getInterfaces(),
                this);
    }

    /**
     * 关联的这个实现类的方法被调用时将被执行
     *
     * @param proxy  定义代理类的类的实例
     * @param method 代理类要实现的接口列表
     * @param args   指派方法调用的调用处理程序
     * @return 返回执行的目标对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====start====");
        /**
         * 打印方法的参数
         */
        if (args != null && 0 != args.length) {
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        System.out.println("====方法被执行前====");
        Object invoke = null;
        try {
            String name = method.getName();
            if (name.equals("add") || name.equals("delete")) {
                // 核心方法被执行
                invoke = method.invoke(target, args);
                System.out.println("====方法被执行后====");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            System.out.println("====方法出错误了====");
        }
        System.out.println("====end====");
        return invoke;
    }

}