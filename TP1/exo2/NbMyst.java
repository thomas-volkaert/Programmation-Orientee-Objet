package TP1.exo2;
import java.util.*;

public class NbMyst{
    public static void main (String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int rep;
        int cible;
        if(a>b){
            System.err.printf("Erreur\n");
            System.exit(1);
        }
        Random ran = new Random();
        do{
            cible = ran.nextInt();
        }while(cible >= b || cible <= a);
        do{
            System.out.println("Devinez le nombre généré :");
            rep = Integer.parseInt( System.console().readLine() );
            if (rep < cible){
                System.out.println("Plus grand");
            }
            else {
                System.out.println("Plus petit");
            }
        }while (rep != cible);
        System.out.println("Vous avez deviné le bon chiffre");
    }
}
