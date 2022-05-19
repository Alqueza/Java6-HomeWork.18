package com.company;

public class Gostinitsa extends  Family implements Arenda{

    private String name4;

    public Gostinitsa(String name1, String name2, String name3, String name4) {
        super(name1, name2, name3);
        this.name4= name4;
    }

    public Gostinitsa() {

    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nname#4 = " + name4 +
                "\nFamily members: 4";
    }

    @Override
    public void adress() {
        System.out.println("Адресс гостиницы: Гостиница #3");
    }

    @Override
    public void arenda() {
        System.out.println("Оплатите арендную плату до завтра");


    }
}