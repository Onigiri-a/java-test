package Thread.exer1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/22 14:25
 */

//如何理解实现callable接口的方式创建多线程比实现runnable接口创建多线程方式强大？
//1 call()可以有返回值的
//2 call（）可以抛出异常，被外面捕获
//3 callable是支持泛值

public class threadNew {
    public static void main(String[] args) {
        //3 创建callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4 将此callable接口实现类的对象传递到futureTake构造器中，创建futureTake的对象
        FutureTask futureTask = new FutureTask(numThread);
        //5 将futureTake的对象作为对象传到thread类的构造器，创建thread对象，并调用start（）方法
        new Thread(futureTask).start();
        try {
            //6 获取callable中的call方法的返回值
            //返回值即为Futuretake构造器参数Callable实现类重写的call（）的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
//1 创建一个实现callable的实现类
class NumThread implements Callable {
    @Override
    //2 实现call方法，将线程需要执行的操作声明在call（）中
    public Object call() throws Exception {
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
     return sum;
    }
}