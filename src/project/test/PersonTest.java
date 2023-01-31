package project.test;

/**
 * 属性和局部变量的区别
 *
 *
 * 属性=成员变量=field=域，字段
 * 方法=成员变量=函数=method
 *
 * 创建累的对象=类的实例化=实例化类
 *
 * 类和对象的使用（面向对象的思想落地实现）
 * 1创建类和设计类的对象
 * 2创建对象
 * 3通过 对象。属性 或者  对象。方法 调用对象的结构
 *
 *
 * 创建一个类的多个对象，每个对象都独立的拥有一套类的属性 非静态（static）
 */
//测试类
public class PersonTest {
    public static void main(String[] args){
        //创建Person类的对象
        Person p1=new Person();
        //调用对象的结构：属性，方法
        //调用属性：对象.属性
        p1.name="Tom";
        System.out.println(p1.name);

        //调用方法：对象.方法
        p1.eat();
        p1.sleep();
        p1.talk("我再俗话");

        //重新创建对象，对象会初始化，每个对象都是独立的
        Person p2=new Person();
        System.out.println(p2.name);


        //只会传递地址，不会改变
        p1=p2;


    }

}

class Person{
    //属性
    String name;
    boolean isMea;
    int age=1;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void talk(String language){
        System.out.println("说话"+language);
    }
}