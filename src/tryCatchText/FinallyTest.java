package tryCatchText;

import org.junit.Test;

public class FinallyTest {
    @Test
    public void test1(){
        int num =method();
        System.out.println(num);

    }
    public int method(){
        try{
            int[] arr=new int[10];

            System.out.println(arr[10]);
            return 12;
        }catch(ArithmeticException e){
            e.printStackTrace();
            return 1;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("11111");
            e.printStackTrace();
            return 2;
        }catch(Exception e){
            e.printStackTrace();
            return 3;
        }finally{
            System.out.println("ÕæË§");
        }
    }


}
