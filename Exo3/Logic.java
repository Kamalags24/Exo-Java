   public class Logic {
    public static void main(String[]args){
        int a = 2, b, c;
        b = a+=2;
        System.out.println(b);

        c = b*=2;
        System.out.println(c);

        // System.out.println(a>b && b<c);

        if (a>b && b<c) {
            System.out.println("La condition est vraie");
        } else  {
            System.out.println("La condition est fausse");
        }
    }
}