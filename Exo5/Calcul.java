   public class Calcul {
    public static void main(String[]args){
       int x = 5;
       float y;
       y = 2.5f;
       System.out.println(y);

        int z = (int) y;
        System.out.println(z);

        if (x > z) {
            System.out.println("x est supérieur à z");
        } else {
            System.out.println("x n'est pas supérieur à z");
        }


        float w = (float) x;
        System.out.println(w);

        if (w > y) {
            System.out.println("w est supérieur à y");
        } else {
            System.out.println("w n'est pas supérieur à y");
        }

    }
}