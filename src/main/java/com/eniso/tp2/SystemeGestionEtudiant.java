package com.eniso.tp2;
import java.util.ArrayList;


public class SystemeGestionEtudiant {
    private ArrayList<Etudiant> list;
    public SystemeGestionEtudiant(ArrayList<Etudiant> list){
        this.list = list;
  }
   public ArrayList<Etudiant> getList() {
       return this.list ;
   }
   public void setList () {
       this.list = list;
   }
   public void ajouterEtudiant(Etudiant e){
       this.list.add(e);
   }
   public void afficherEtudiant(){
       System.out.println(toString());
   }
   public void modifierEmailEtudiant(int numIns, String nouvelEmail){
       for(Etudiant e : this.list){
           if (e.getNumIns() == numIns){
               e.setEmail(nouvelEmail);
               
           }
       }
    }
   public void supprimerEtudiant(int numIns){
       for(Etudiant e : this.list){
           if (e.getNumIns() == numIns){
               this.list.remove(e);
           }
       
   }
   }
  
}
