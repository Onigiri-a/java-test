package project.test;

/**
 * 面向对象特征之一：封装与隐藏
 *封装性的体现
 * 我们将类的属性私有化（private），同时，提供公共的（public）方法来获取（get）和设置（set）
 *
 * 权限修饰符
 *
 * java规定了4种权限修饰符： private 缺省 protected public
 */
public class AnimalTest {
    public static void main(String[] args){
        Animal an=new Animal();
        an.name="大黄";
        an.age=1;
        an.setLegs(4);
        an.show();

    }
}
class Animal{
    String name;
    int age;
    private int legs;


    public void setLegs(int l){
        if(l>0){
            legs=l;
        }else{
            legs=0;
        }
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void show(){
        System.out.println("name"+name+"age"+age+"legs"+legs);
    }
}
