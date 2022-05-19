package com.company;

public class Obshejitie extends  Family implements Arenda {

    private String name4;
    private String name5;

    public Obshejitie(String name1, String name2, String name3,String name4,String name5) {
        super(name1, name2, name3);
        this.name4 = name4;
        this.name5 = name5;
    }

    public Obshejitie() {

    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public String toString() {
        return super.toString()+
                "\nname#4 = "+ name4 +
                "\nname#5 = "+ name5 +
                "\nFamily members: 5";
    }

    @Override
    public void adress() {
        System.out.println("Адресс общежития: xasdy3041");
    }

    @Override
    public void arenda() {
        System.out.println("Оплатите арендную плату до конца недели");
    }
}