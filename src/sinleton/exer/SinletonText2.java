package sinleton.exer;

public class SinletonText2 {
    public static void main(String[] args) {
       Sinleton1 res= Sinleton1.getGetIn();
       Sinleton1 asc= Sinleton1.getGetIn();
       System.out.println(res);

    }

}
 class Sinleton1{
    private Sinleton1(){

    }
    private static Sinleton1 getIn=new Sinleton1();

     public static Sinleton1 getGetIn() {
         return getIn;
     }
 }

 class Sinleton2{

    private Sinleton2(){

    }
    private static Sinleton2 getIn=null;

     public static Sinleton2 getGetIn() {
         if(getIn==null){
             getIn=new Sinleton2();
         }
         return getIn;
     }
 }