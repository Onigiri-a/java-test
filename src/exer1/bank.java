package exer1;


public class bank {
   private Customer[] customers;//存放多个客户
   private int number;//记录客户数
   public bank(){
       customers =new Customer[10];

   }
   //添加客户
   public void addCustomer(String f,String l){
      Customer cust= new Customer(f,l);
      customers[number++]=cust;

   }
   //获取客户个数
    public int getNumber() {
        return number;
    }
    public Customer getCustomer(int index){

        if(index>=0 && index<number ){
            return customers[index];
        }
        return null;
    }
}
