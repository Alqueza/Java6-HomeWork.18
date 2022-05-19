package com.company;

public class Kvartira extends Family implements Comunal {

    public Kvartira(String name1, String name2, String name3) {
        super(name1, name2, name3);
    }

    public Kvartira(){

    }

    @Override
    public String toString() {
        return super.toString()+
                "\nFamily members: 3";
    }

    @Override
    public void adress() {
        System.out.println("Адресс квартиры: Радужная 3");
    }

    @Override
    public void comunalka() {
        System.out.println("Оплатите комунальную услугу до 31.03.22");
    }
}