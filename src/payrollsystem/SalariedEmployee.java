package payrollsystem;

import birthday.exer.MyDate;

public class SalariedEmployee extends  Employee{
    private double monthlySalary;

    public SalariedEmployee(String name, double number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double earnnings() {
        return getMonthlySalary();

    }

    @Override
    public String toString() {
        return "monthlySalary  "+ super.toString() + monthlySalary;

    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
