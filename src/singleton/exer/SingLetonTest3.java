package singleton.exer;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/20 14:44
 */


public class SingLetonTest3 {

    public static void main(String[] args) {

    }


}
class SingletonLan{
     private  SingletonLan(){
        super();
    }

    private static  SingletonLan singletonLan=null;

     public SingletonLan getSingletonLan(){

         if(singletonLan==null){
             return singletonLan=new SingletonLan();
         }
      return singletonLan;
     }
}


/**
 * 方式一，效率太差
 */
class SingletonLan1{
    private  SingletonLan1(){
        super();
    }
    private static  SingletonLan1 singletonLan1=null;

    public synchronized SingletonLan1 getSingletonLan1(){

        if(singletonLan1==null){
            return singletonLan1= new SingletonLan1();
        }
        return singletonLan1;
    }
}
/**
 * 方式二，效率高
 */
class SingletonLan2{
    private  SingletonLan2(){
        super();
    }
    private static  SingletonLan2 singletonLan2=null;

    public  SingletonLan2 getSingletonLan2(){
        if(singletonLan2==null){
            synchronized(SingletonLan2.class){
                if(singletonLan2==null){
                    return singletonLan2= new SingletonLan2();
                }
            }
        }

        return singletonLan2;
    }
}


class Singletoner{

    private Singletoner(){
        super();
    }
    private static Singletoner singletoner=new Singletoner();

    public static Singletoner getSingletoner() {
        return singletoner;
    }
}