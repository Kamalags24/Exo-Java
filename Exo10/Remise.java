public class Remise {
    public static void main(String[]args){
        int montant = 300;

        if (montant < 100) {
            System.out.println("Pas de remise");
        } else if (montant >= 100 || montant <= 500) {
            int remise;
            remise = (montant * 10)/100;
            int somme;
            somme = montant + remise;
            
            System.out.println("Vous obtenez une remise de 10% soit un montant total de: " + somme);
        } else {
            int remise;
            remise = (montant * 20)/100;
            int somme;
            somme = montant + remise;

            System.out.println("Vous obtenez une remise de 20% soit un montant total de: " + somme);
        }
    }
}