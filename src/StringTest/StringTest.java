package StringTest;

import org.junit.Test;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/23 14:19
 */


public class StringTest {

    @Test
    public void test(){
        System.out.println(reverse("abcdefg",3,4));
        System.out.println(reverse1("abcdefg",3,4));
        System.out.println(reverse2("abcdefg",3,4));

    }


   public String reverse(String str, int start, int end){
        char[] chars=str.toCharArray();

       for (int i = start,e=end; i <e ; i++,e--) {
           char temp=chars[i];
           chars[i]=chars[e];
           chars[e]=temp;
       }
        return new String(chars);
   }



    public String reverse1(String str, int start, int end){
        String  startStr= str.substring(0,start);

        for (int i = end; i >=start ; i--) {
            startStr+=str.charAt(i);
        }
        String reverseStr=startStr+str.substring(end+1);
        return reverseStr;
    }

    public String reverse2(String str, int start, int end){
        StringBuffer  startStr= new StringBuffer(str.substring(0,start));

        for (int i = end; i >=start ; i--) {
            startStr.append(str.charAt(i));
        }
        String reverseStr=startStr+str.substring(end+1);
        return reverseStr;
    }




    @Test
    public void test2(){
        System.out.println(reverse("abcdefg",3,4));
        System.out.println(reverse1("abcdefg",3,4));
        System.out.println(reverse2("abcdefg",3,4));

    }

    @Test
    public void test3(){

        String s="III";

        int num=0;
        for (int i = 0; i <s.length() ; i++) {



        }
    }
}
