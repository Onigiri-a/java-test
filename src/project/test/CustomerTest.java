package project.test;


/**
 * 类中方法的声明和使用
 * 方法：描述类应该具有的功能
 *
 * void 没有返回值
 *
 *
 * 方法声明：权限修饰符 返回值类型方法名（形参列表）{
 *     方法体
 * }
 *
 * 权限修饰符
 * --private
 * --public
 * --缺省
 * --protected
 *
 * 返回值：
 * 有返回值，方法声明时必须指定返回值类型 return返回指定返回类型
 *
 * 没有返回值，void 不用返回，不用return，想要使用   return;
 *
 * return 结束方法 针对于有返回值的
 *
 * 方法可以调用方法，但是不可以定义方法
 */


public class CustomerTest {

}

 class Customer{
//    方法
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
