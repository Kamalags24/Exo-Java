public class Classification {
    public static void main(String[]args){
        int age = 35;

        if (age <= 12){
            System.out.println("Enfant");
        } else if (age >= 13 || age <= 19) {
            System.out.println("Adolescent");
        } else if (age >= 20 || age <= 64) {
            System.out.println("Adulte");
        } else {
            System.out.println("Senior");
        }
    }
}