public class Mot{
    public String mot;

    void lireMot(){
        System.out.println("Entrer mot : ");
        mot = System.console().readLine();
    }

    public String toString(){
        return mot;
    }
    public void afficheVoyelle(){
        int i;
        String motVoyelle = "";
        for (i=0; i< mot.length(); i++){
            if((mot.charAt(i)=='a') || (mot.charAt(i)=='e') || (mot.charAt(i)=='i') || (mot.charAt(i)=='o') || (mot.charAt(i)=='u') || (mot.charAt(i)=='y')){
                motVoyelle = motVoyelle + mot.charAt(i);
            }
        }
        System.out.println(motVoyelle);
    }
    public void estPalindrome(){
        int i;
        String motInverse = "";
        for(i=mot.length()-1; i>=0; i--){
            motInverse += mot.charAt(i);
        }
        if(motInverse.equals(mot)){
            System.out.println(mot+" est un palindrome.");
        }
        else{
            System.out.println(mot+" n'est pas un palindrome.");
        }
    }
    public int estContenu(String mot2){
        int i=0,j;
        boolean f=false;
        String resultat="";

        while(i != mot.length()&& f==false){
            if(mot.charAt(i) == mot2.charAt(0)){
                for(j=0; j<mot2.length(); j++){
                    if(mot.charAt(i+j)==(mot2.charAt(j))){
                        resultat += mot.charAt(i+j);
                    }
                }
                if(mot2.equals(resultat)){
                    f=true;
                    System.out.println("ça marche zebi");
                    return 1;
                }
                else{
                    resultat="";
                }

            }

            i++;
        }
        System.out.println("marche pas :/");
        return 0;
    

    }
    public void Trie () {
        StringBuffer resultat = new StringBuffer("i");
        int i,j, compare,res;
        for(i=0; i<mot.length(); i++){
            compare = (int)mot.charAt(i);
            for(j=0; j<resultat.length(); j++){
                res = (int)resultat.charAt(j);
                if (compare<res){
                    resultat.insert(j-1,mot.charAt(i)) ;
                }
            }
        }
        System.out.println(resultat);
    }


    public static void main(String[] args){
        Mot a = new Mot();
        a.lireMot();
        /*System.out.println(a.mot);
        a.afficheVoyelle();
        a.estPalindrome();*/
        a.estContenu("tique");
        a.Trie();
        

    }
}