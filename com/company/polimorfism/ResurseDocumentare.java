package com.company.polimorfism;

public class ResurseDocumentare {
        private String titlu;
        private int disponibilitateSurse;
        private String domeniu = "null";

        public ResurseDocumentare (String titlu, int disponibilitateSurse, String domeniu) {
            this.titlu = titlu;
            this.disponibilitateSurse= disponibilitateSurse;
             this.domeniu = domeniu;
        }

        public String calculColectieTotal() {

            return "Numarul colectiei este de : unknown";
        }

        public String getTitlu() {

            return titlu;
        }

        public void setTitlu(String titlu) {

            this.titlu = titlu;
        }

        public float getDisponibilitateSurse() {

            return disponibilitateSurse;
        }

        public void setDisponibilitateSurse(int  disponibilitateSurse) {

            this.disponibilitateSurse= disponibilitateSurse;
        }

        public String getDomeniu() {

            return domeniu;
        }

        public void setDomeniu(String domeniu) {

            this.domeniu = domeniu;
        }


        @Override
        public String toString() {
            return "Resurse Documentare:" +'\n' +
                    "Titlul ='" + titlu + '\n' +
                    "Disponibilitate=" + disponibilitateSurse +'\n' +
                    " Domeniu='" + domeniu + '\n';
        }
    }

