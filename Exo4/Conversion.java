   public class Conversion {
    public static void main(String[]args){
        int intVar = 25;
        double doubleVar = intVar;
        System.out.println(intVar);

        System.out.println(doubleVar);

        short shortVar = (short) doubleVar;

        System.out.println(shortVar);
    }
}