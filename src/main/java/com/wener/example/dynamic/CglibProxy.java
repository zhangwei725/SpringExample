package com.wener.example.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 实现了一个方法拦截器接口
 */
public class CglibProxy implements MethodInterceptor {
    // 实例化动态代码生成器
    private Enhancer enhancer = new Enhancer();

    /**
     * 动态生成一个新的类，使用父类的无参构造方法创建一个指定了特定回调的代理实例
     *
     * @param clazz 被代理对象
     * @return
     */
    public Object getProxy(Class clazz) {
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        //设置回调方法
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    /**
     * 实现MethodInterceptor接口方法
     * 拦截被代理对象的方法
     *
     * @param obj    代理类实例
     * @param method 被代理类所调用的被代理的方法
     * @param args   参数值列表
     * @param proxy  生成的代理类对方法的代理引用
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println(obj.getClass().getName());
        System.out.println("前置代理");
        //通过代理类调用父类中的方法
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("后置代理");
        System.out.println(proxy.getClass().getName());
        return result;
    }
}