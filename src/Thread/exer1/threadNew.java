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

//������ʵ��callable�ӿڵķ�ʽ�������̱߳�ʵ��runnable�ӿڴ������̷߳�ʽǿ��
//1 call()�����з���ֵ��
//2 call���������׳��쳣�������沶��
//3 callable��֧�ַ�ֵ

public class threadNew {
    public static void main(String[] args) {
        //3 ����callable�ӿ�ʵ����Ķ���
        NumThread numThread = new NumThread();
        //4 ����callable�ӿ�ʵ����Ķ��󴫵ݵ�futureTake�������У�����futureTake�Ķ���
        FutureTask futureTask = new FutureTask(numThread);
        //5 ��futureTake�Ķ�����Ϊ���󴫵�thread��Ĺ�����������thread���󣬲�����start��������
        new Thread(futureTask).start();
        try {
            //6 ��ȡcallable�е�call�����ķ���ֵ
            //����ֵ��ΪFuturetake����������Callableʵ������д��call�����ķ���ֵ
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
//1 ����һ��ʵ��callable��ʵ����
class NumThread implements Callable {
    @Override
    //2 ʵ��call���������߳���Ҫִ�еĲ���������call������
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