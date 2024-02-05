/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

public class Livre {
  private String Titre;
  private String Auteur;
  private int AnneePub;
  private int ISBN;
  public Livre(){
      this.Titre ="etranger" ;
      this.Auteur = "Camus";
      this.AnneePub = 1938;
      this.ISBN = 12;
     }
  public Livre(String Titre, String Auteur){
      this.Titre = Titre;
      this.Auteur = Auteur;
      this.AnneePub = 1938;
      this.ISBN = 12;
  }
  public Livre(String Titre, String Auteur, int AnneePub, int ISBN){
      this.Titre = Titre;
      this.Auteur = Auteur;
      this.AnneePub = AnneePub;
      this.ISBN = ISBN;
  }
  
}
