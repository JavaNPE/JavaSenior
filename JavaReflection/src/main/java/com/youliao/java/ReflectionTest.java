package com.youliao.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Dali
 * @Date 2021/5/11 18:31
 * @Version 1.0
 * @Description
 */
public class ReflectionTest {

    //反射之前对Person的操作
    @Test
    public void test1() {
        Person p1 = new Person("Tom", 12);
        p1.age = 18;
        System.out.println(p1.toString());
        p1.show();
    }

    //反射 对person的操作
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class aClass = Person.class;
        //1\通过反射创建Person类的对象
        Constructor constructor = aClass.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("Tom", 12);
        System.out.println(obj.toString());
        Person p = (Person) obj;
        System.out.println(p.toString());
        //2、通过反射，调用对象指定的属性 方法
        Field age = aClass.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p.toString());

        //嗲用方法
        Method show = aClass.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("*88*******************************88*");

        //通过反射 调用Person类的私有结构
        //通过反射调用私有的构造器
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Person p1 = (Person) declaredConstructor.newInstance("Jerry");
        System.out.println(p1);


        //通过反射调用私有的属性
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "HaMeiMei");
        System.out.println(p1);


        //嗲用私有的方法
        Method showNation = aClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        showNation.invoke(p1, "漂亮国");       //invoke 相当于  p1.showNation("漂亮国")
    }

    @Test
    public void test3() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
    }
}
