package com.company.abstractclass;

public abstract class Angajator {
    private String nume;
    private String adresa;
    private String compania;
    private int dateContact;

    public Angajator (String nume, String adresa, String compania, int dateContact) {
        this.nume= nume;
        this.adresa = adresa;
        this.compania = compania;
        this.dateContact = dateContact;
    }
    public float achitareSalariu(){
         System.out.println("Salariul angajatorului");
         return 0;
    }
    public void transmiteNotificare(){
          System.out.println("Notificarea a fost trimisa lui " + this.nume + " " + this.adresa);
    }

    public String toString() {
        return nume + " " + adresa+  " " + dateContact;
    }

    public String getNume(){
        return nume;
    }

    public String getAdresa(){
        return adresa;
    }

    public String getComapnia(){
        return compania;
    }

    public int getDateContact(){
        return dateContact;
    }

    public void setAdresa (String newAdresa){
       adresa = newAdresa;
    }

    public void setDateContact (int newDateContact){
        dateContact = newDateContact;
    }
}
