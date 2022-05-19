package com.company;

public class Main {

    public static void main(String[] args) {
        Kvartira dom1 = new Kvartira("Aidin","Talai","Dinara");
        System.out.println(dom1);
        dom1.adress();
        dom1.comunalka();
        System.out.println();

        Obshejitie obshaga = new Obshejitie("Abai","Daniyar","Chyngyz","Rasul","Aziret");
        System.out.println(obshaga);
        obshaga.adress();
        obshaga.arenda();
        System.out.println();

        Gostinitsa gostinitsa = new Gostinitsa("Kadyr","Mark","Ostin","Rye");
        System.out.println(gostinitsa);
        gostinitsa.adress();
        gostinitsa.arenda();
    }
}
