package TP1.exo2;
import java.util.*;

public class NbMyst2{
	private int a;
	private int b;
	private int rep;
	private int cible;
	Random ran = new Random();

	void BorderMin(int min){
		this.a = min;
	}
	void BorderMax(int max){
		this.b = max;
	}

	void RandomGen(){
		do{
			this.cible = ran.nextInt();
		}
		while ( cible >= b || cible <= a );
	}


	void Start(){
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
    public static void main(String[] args){
        NbMyst2 a = new NbMyst2();
        a.BorderMin(Integer.parseInt(args[0]));
        a.BorderMax(Integer.parseInt(args[1]));
        a.RandomGen();
        a.Start();
    }

}



