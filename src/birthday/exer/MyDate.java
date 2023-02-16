package birthday.exer;

public class MyDate {
    private int year;
    private int month;
    private int day;


    public String toDateString(){
        return year+"Äê"+month+"ÔÂ"+day+"ÈÕ";
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}



