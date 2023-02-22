package singleton.exer;



public class Singleton {

    //1私有化构造器
    //声明当前类对象，没有初始化
    //声明public static返回类对象的方法
    //对此对象必须声明为static


    //1私有化构造器

    private Singleton() {

    }

    //声明当前类对象，没有初始化
    private static Singleton order = null;

    //声明public static返回类对象的方法
    public static Singleton getInstance() {
        if (order == null) {
            return order = new Singleton();
        }
        return order;
    }


}
