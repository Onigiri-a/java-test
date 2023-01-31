package project.test;

public class girlTest {


    private String name;
    private int age;

    public girlTest(){

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void marry(boyTest boy){
        System.out.println("hahahh ");
    }
    public void shout(){
        if(this.age >22){
            System.out.println("借");
        }else{
            System.out.println("借");
        }
    }

}
