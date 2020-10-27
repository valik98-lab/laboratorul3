package com.company.polimorfism;

public class PresaPeriodica extends ResurseDocumentare{

    private float pret;
    private float exemplare ;

    public PresaPeriodica  (String titlu, int disponibilitate , float pret,float exemplare){
        super(titlu,disponibilitate,"Istoie");
        this.pret = pret;
        this.exemplare = exemplare;
    }

    public float getPret() {
        return pret;
    }

    public void setPret (float pret) {
        this.pret = pret;
    }

    public float getExemplare () {
        return exemplare;
    }

    public void setExemplare(float exemplare) {
        this.exemplare= exemplare;
    }

    public String calculColectieTotal() {
        float col= getExemplare()* getPret();
        return "Costul total al colectiei " + getTitlu() + " este de : " + col;
    }

    @Override
    public String toString() {
        return "Presa Periodica" +'\n' +
                "Numarul de exemplare =" + exemplare +'\n' +
                "Pretul exemplarelor =" + pret +'\n';
    }
}
