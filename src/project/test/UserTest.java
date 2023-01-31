package project.test;

/**
 * 类中属性的使用
 *
 *属性（成员变量）vs局部变量
 * 1相同点：
 *  （1）定义的方式一样
 * （2）先声明 后使用
 * （3）变量都有其对应的作用域
 *
 *
 *
 * 2不同点：
 * （1）在类中声明的位置不同
 * ---成员变量是在{}内
 * ---局部变量在方法内、代码块、构造器形参、构造器内部的变量
 * （2）关于权限修饰符不同
 * ---属性：可以在声明属性时，指明权限，使用权限修饰符，常用修饰符：private public 缺省 protected
 * ---局部变量：不能使用修饰符
 * （3）默认初始化：
 * ---属性：类的属性，根据其类型，都有默认值，整形（byte、short、int）：0   浮点型（float、double）：0.0   字符型（char）0或者“\u0000”   布尔型（boolean）:false   引用数据类型：null
 * ---局部变量：没有默认的初始化值 一定要显式赋值，形参在调用的时候我们赋值即可
 * （4）内存加载位置不一样
 * ---属性：加载到堆空间（非static）
 * ---局部变量加载到栈空间
 *
 */
public class UserTest {
}

 class User{

    //属性（或者成员变量）
    String name;
    int age;
    boolean isMale;

     public void talk(String language){ //language:形参
         System.out.println("说话"+language);
     }
     public void eat(){
         String food="大饼";//局部变量
         System.out.println("吃饭"+food);
     }

}