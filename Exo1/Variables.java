public class Variables {
    public static void main (String[] args) {
        byte myByte = 2;
        System.out.println("Taille de byte : " + Byte.BYTES + " octets");


        short myShort=112;
        System.out.println("Taille de short : " + Short.BYTES + " octets");

        int myInt=1896;
        System.out.println("Taille de int : " + Integer.BYTES + " octets");

        long myLong=21231548;
        System.out.println("Taille de long : " + Long.BYTES + " octets");

        float myFloat= 18.5f;
        System.out.println("Taille de float : " + Float.BYTES + " octets");

        double myDouble= 19.5d;
        System.out.println("Taille de double : " + Double.BYTES + " octets");

        char myChar= 'K';
        System.out.println("Taille de char : " + Character.BYTES + " octets");

        boolean myBool= true;
        System.out.println(myBool);
    }
}