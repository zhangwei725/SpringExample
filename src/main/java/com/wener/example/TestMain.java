package com.wener.example;


import com.wener.example.annotations.DataSource;
import com.wener.example.annotations.DataSourceManager;
import com.wener.example.annotations.MysqlDataSource;
import com.wener.example.annotations.User;
import com.wener.example.aop.aspect.AspectDao;
import com.wener.example.aop.base.UserDaoImpl;
import com.wener.example.aop.pojo.PojoDao;
import com.wener.example.bean.Application;
import com.wener.example.bean.Shop;
import com.wener.example.dao.UserDao;
import org.springframework.aop.framework.ReflectiveMethodInvocation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author zhangwei
 */
public class TestMain {

    public static void main(String[] args) {
//        test();
//        testBeanProperty();
//        testBeanConstructor();
//        testAutowire();
//        testUser();
//        testDataSource();
//        testAoP();
//        testAopByPojo();
        testAspect();
    }


    private static void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);
        UserDao dao1 = (UserDao) context.getBean("userDao");
        System.out.println(dao);
        System.out.println(dao1);
    }


    public static void testBeanProperty() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user);
        System.out.println(user1);
    }


    public static void testBeanConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shop shop = context.getBean("shop2", Shop.class);
        System.out.println(shop.getDetail().getDesc());
    }

    private static void testAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Application app = context.getBean("application", Application.class);
        System.out.println(app.getUser().toString());
    }

    private static void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getAddress1());
    }

    private static void testDataSource() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        DataSourceManager dataSourceManager = context.getBean("dataSourceManager", DataSourceManager.class);
        dataSourceManager.getDataSource().connection();
    }

    private static void testAoP() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-base.xml");
        com.wener.example.aop.base.UserDao dao = (com.wener.example.aop.base.UserDao) context.getBean("proxy");
        dao.save(new User());
    }

    private static void testAopByPojo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        PojoDao dao = (PojoDao) context.getBean("pojoDao");
        dao.test();
    }

    private static void testAspect() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aspect.xml");
        AspectDao dao = (AspectDao) context.getBean("aspectDao");
//        dao.test();
        dao.testParams(1, "hello");

    }
}
