package TP1.exo4;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
public class Personne {
    private String nom;
    private String prenom;
    private Date dateNaissance = new Date();
    private Date dateMarriage = new Date();
    private int marry;

    public Personne(String Nom, String Prenom, Date DateNaissance,int Marry){
        this.nom = Nom;
        this.prenom = Prenom;
        this.dateNaissance = DateNaissance;
        this.marry = Marry;
        if(Marry == 1){
            System.out.println("Entrer date marriage :");
            String dateM = System.console().readLine(); 
        }
    }
    public static void Marry(Personne personne1, Personne personne2){
        Date dateMarriage = new Date();

        if(statusMarry(personne1) == 1 && statusMarry(personne2) == 1){
            if(dateMarriage.compareTo(personne1.dateNaissance)==-1 && dateMarriage.compareTo(personne2.dateNaissance)==-1){
                System.err.println("Erreur Date Marriage !");
            }
        }
        else if(statusMarry(personne1) == 0 && statusMarry(personne2) == 0){
            personne1.marry = 1;
            personne2.marry = 1;
        }
    }

    public static int statusMarry(Personne personne){
        if(personne.marry == 1){
            System.out.println("Cette personne est mariée");
            System.out.println(personne.dateMarriage.toString());
            return 1;
        }
        else{
            System.out.println("Cette personne n'est pas mariée");
            return 0;
        }
    }
    ///////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args){
        Date dateN = new Date("05/03/2001");
        Personne Thomas = new Personne("Volkaert","Thomas",dateN,0);
    }

}
