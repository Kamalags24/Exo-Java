public class Comparaison {
    public static void main(String[]args){
        int a = 2, b = 5, c = 12;
        int X;

        if (a < b && b < c) {
            X = c;
            System.out.println("Le plus grand nombre est : " + X );
        } else if (a < b && b > c) {
             X = b;
            System.out.println("Le plus grand nombre est : " + X );
        } else if (a > b && b < c) {
            X = a;
            System.out.println("Le plus grand nombre est : " + X );
        } else {
            System.out.println("Tous les nombres sont égaux");
        }
    }
}