package payrollsystem;

import birthday.exer.MyDate;

public class hourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public hourlyEmployee(String name, double number, MyDate birthday , double wage,double hour) {
        super(name, number, birthday);
        this.wage=wage;
        this.hour=hour;
    }

    @Override
    public double earnnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "hourlyEmployee   "+super.toString()+earnnings();
    }
}
