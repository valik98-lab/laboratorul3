package com.company.abstractclass;

public class Main {
    public static void main(String [] args) {
    Salariat s = new Salariat("Vasile","vasile@email.ru","MoldoTV",12,3200F);
    Angajator a = new Salariat ("Alexandru", "alexandru@gmail.com", "British", 24,2400F);
            System.out.println("\n Trimiteti notificare salariatului ");
            s.transmiteNotificare();
            System.out.println("\n Trimiteti notificare  angajatorului ");
            a.transmiteNotificare();
    }
}
