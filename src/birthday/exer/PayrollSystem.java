package birthday.exer;

public class PayrollSystem {
    public static void main(String[] args){
        Employee[] meps= new Employee[2];
        meps[0]=new SalariedEmployee("Ð¡Ã÷",1002,new MyDate(2018,7,25),10000);
        meps[1]=new HourlyEmployee("Ð¡ºÚ", 1003, new MyDate(2005, 4, 23),240,60);
        for(int i=0;i<meps.length;i++){
            System.out.println(meps[i]);
            System.out.println(meps[i].earnings());

        }

    }
}
