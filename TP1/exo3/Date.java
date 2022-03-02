package TP1.exo3;

public final class Date implements Comparable<Date> {
    private int annee;
    private int mois;
    private int jour;
    void Affiche(int a, int b, int c){
        this.jour = a;
        this.mois = b;
        this.annee = c;
        System.out.printf("%d/%d/%d\n", a,b,c);
    }
    public Date(int day, int month, int year){
        this.annee = year;
        this.mois = month;
        this.jour = day;
    }
    public Date(){
        this.annee = 0;
        this.mois = 0;
        this.jour = 0;
    }
    @Override
    public String toString(){
        return String.valueOf(this.jour) + "/" + String.valueOf(this.mois) + "/" + String.valueOf(this.annee);
    }
    public int compareTo(Date z){
        if(this.annee == z.annee){
            if(this.mois == z.mois){
                if(this.jour == z.jour){
                    return 0;
                }
                else if (this.jour > z.jour){
                    return 1;
                }
                else{
                    return -1;
                }  
            } 
            else if (this.mois > z.mois){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (this.annee > z.annee){
            return 1;
        }
        else{
            return -1;
        }
        
    }


    public static void main(String[] args){
        Date z = new Date(31,01,2022);
        System.out.println("Entrer jour:");
        int j = Integer.parseInt( System.console().readLine() );
        System.out.println("Entrer mois:");
        int m = Integer.parseInt( System.console().readLine() );
        System.out.println("Entrer année :");
        int a = Integer.parseInt( System.console().readLine() );
        Date date = new Date();
        date.Affiche(j,m,a);
        System.out.println(date.toString());
        if(date.compareTo(z) == 0){
            System.out.println("Meme Date");
        }
        else if(date.compareTo(z) == 1){
            System.out.println("Date dans le turfu");
        }
        else {
            System.out.println("Date dans le passe");
        }
    }
}
