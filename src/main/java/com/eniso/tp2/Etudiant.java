/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;


public class Etudiant {
    private String nom ;
    private String prenom;
    private int numIns ;
    private String email;
    
    public Etudiant(String nom,String prenom,int numIns,String email){
        this.nom = nom;
        this.prenom = prenom;
        this.numIns = numIns;
        this.email = email;
    }
     public String getName() {
         return this.nom;
     }
     public void setName(String nom){
         this.nom = nom;
     }
      public String getPrenom() {
         return(this.prenom);
     }
     public void setPrenom(String prenom){
         this.prenom = prenom;
     }
      public int getNumIns() {
         return this.numIns ;
     }
     public void setNumIns(int numIns){
         this.numIns = numIns;
     }
     public String getEmail() {
         return this.email ;
     }
     public void setEmail(String email){
         this.email = email;
     }
    public String toString(){
        return "Etudiant[id=" + this.numIns + ", nom=" + this.nom + "prenom=" + this.prenom+"]";
    }
    
}
