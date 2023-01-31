package project.test;

/**
 * 匿名对象
 *
 * 我们创造的对象没有显式的赋给一个变量名，即为匿名函数
 * 特征：匿名函数只能调用一次
 * 使用：
 */
public class InstanceTest {
    public static void main(String[] args){
        new Phone().ipad();
        new Phone().name="res";
        new Phone().mac();

            PhoneMall mall=new PhoneMall();
            mall.show(new Phone());

    }
}
class PhoneMall{


    public void show(Phone phone){
        phone.ipad();
        phone.iphone();
        phone.mac();

    }

}
class Phone{
    //属性
    String name;
    boolean isMea;
    int age=1;

    public void ipad(){
        System.out.println("平板");
    }
    public void iphone(){
        System.out.println("手机");
    }
    public void mac(){
        System.out.println("电脑"+name);
    }
}