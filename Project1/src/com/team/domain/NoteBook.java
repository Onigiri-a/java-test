package com.team.domain;

public class NoteBook implements Equipment{

    private String model;//?????ͺ?
    private String price;//?۸?

    public NoteBook(String model, double price){
        super();
    }

    public NoteBook(String model, String price) {
        super();
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model+"("+price+")";
    }
}
