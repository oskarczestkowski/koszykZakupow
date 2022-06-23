package com.company;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	koszykZakupow koszyk = new koszykZakupow();

    koszyk.dodajProdukty("P1");
    koszyk.dodajProdukty("P2");
    koszyk.dodajProdukty("P3");

    koszyk.pokazZamowienie();

    }
}
class koszykZakupow {
    private LinkedList produkty = new LinkedList();

    public void dodajProdukty(String produkt) {
    produkty.add(produkt);
    }

    public void pokazZamowienie() {
        System.out.println("Zamowione produkty");
        System.out.println(produkty);
    }
}