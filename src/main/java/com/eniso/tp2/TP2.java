

package com.eniso.tp2;
import java.util.ArrayList;

public class TP2 {
   
    public static void main(String[] args) {
        Etudiant e = new Etudiant("aze","azer", 123, "a");
        ArrayList<Etudiant> listEtudiant = new ArrayList<>();
        listEtudiant.add(e);
        SystemeGestionEtudiant s = new SystemeGestionEtudiant(listEtudiant);
        Etudiant e1 = new Etudiant("saf","kh", 0, "safsaf");
        s.ajouterEtudiant(e1);
        //afficherEtudiant();
        Livre L = new Livre();
        Livre L1 = new Livre("Atomic","jeff");
        Livre L2 = new Livre("PR", "A", 1234 , 12);
    }
}
