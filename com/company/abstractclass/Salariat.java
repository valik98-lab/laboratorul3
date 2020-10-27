package com.company.abstractclass;

public class Salariat extends Angajator {
    private float salariu;

    public Salariat(String nume, String adresa, String compania, int dateContact, float salariu) {
        super(nume, adresa, compania, dateContact);
        setSalariu(salariu);
    }

    public void transmiteNotificare() {
        System.out.println("Transmite notificare despre salariu ");
        System.out.println("Notificare transmisa lui :" + getNume() + " cu salariul de " + salariu);
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float newSalariu) {
        if (newSalariu >= 0) {
            salariu = newSalariu;
        }
    }

    public float achitareSalariu() {
        System.out.println("Salariul pentru  " + getNume());
        return salariu / 52;
    }
}
