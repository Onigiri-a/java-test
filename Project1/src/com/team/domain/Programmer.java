package com.team.domain;

import com.team.service.Status;

public class Programmer extends Employee{
    private int memberId;//团队
    private Status status=Status.FREE;//状态
    private Equipment equipment;//领取设备

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDesigner()+ "\t程序员\t" + "\t" + status+"\t\t\t"+ equipment.getDescription();
    }
}
