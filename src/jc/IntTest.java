package jc;//class HelloWorld {
//    public static void main(String[] args){
//        System.out.println("hello world");
//    }
//}
//class BitTest{
//    public static void main(String[] args){
//        System.out.println("hello nihao");
//
//    }
//}

//import java.util.Scanner;
//class ScannerTest{
//    public static void main(String[] args){
//
//        Scanner scan=new Scanner(System.in);
//        int num =scan.nextInt();
//        System.out.println(num);
//    }
//}




/*
��ȡ����ѭ��
 */

/*
for
 */
//
//import java.util.Scanner;
//class IntTest{
//    public static void main(String[] args){
//
//        Scanner scan=new Scanner(System.in);
//        int fNum=0;
//        int zNum=0;
//        for(;;){
//            int num=scan.nextInt();
//            if(num > 0){
//                zNum++;
//            }else if( num < 0 ){
//                fNum++;
//            }else{
//                System.out.println("������:"+fNum);
//                System.out.println("������:"+zNum);
//                break;
//            }
//        }
//    }
//
//
//}



import org.junit.Test;

import java.util.Scanner;

public class IntTest{



    @Test
    public void aaaTest(){
        System.out.println("������:");
    }
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
         char test=Utility.num();
        System.out.println(test);
        int fNum=0;
        int zNum=0;
        for(;;){
            int num=scan.nextInt();
            if(num > 0){
                zNum++;
            }else if( num < 0 ){
                fNum++;
            }else{
                System.out.println("������:"+fNum);
                System.out.println("������:"+zNum);
                break;
            }
        }
    }


}

