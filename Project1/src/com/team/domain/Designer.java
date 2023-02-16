package com.team.domain;

public class Designer extends Programmer {

    public Designer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary, equipment);
    }

    @Override
    public String toString() {
        return getDesigner()+ "\t…Ëº∆ ¶\t\t"  + getStatus()+"\t\t\t";
    }
}
