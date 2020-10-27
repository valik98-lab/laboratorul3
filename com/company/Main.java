
package com.company;
import com.company.polimorfism.ResurseDocumentare;
import com.company.polimorfism.Carti;
import com.company.polimorfism.PresaPeriodica;
import com.company.polimorfism.ColectiiAudioVideo;

public class Main {

    public static void main(String[] args) {

        ResurseDocumentare resurseDocumentare1 = new Carti("Adevarul", 5, 142F, 200);
        ResurseDocumentare resurseDocumentare2 = new PresaPeriodica("Literatura si arta", 3, 54F, 24);
        ResurseDocumentare resurseDocumentare3 = new ColectiiAudioVideo("In jurul lumii", 2, 105F, 112);

        ResurseDocumentare[] resurseDoc = {resurseDocumentare1, resurseDocumentare2, resurseDocumentare3};

        for (ResurseDocumentare r : resurseDoc) {
            System.out.println(r);
            System.out.println("\t" + r.calculColectieTotal());
            System.out.println("\tSelectarea domeniului : " + r.getDomeniu() + "\n");
        }
    }
}
