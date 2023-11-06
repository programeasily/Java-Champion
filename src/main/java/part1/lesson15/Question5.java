package part1.lesson15;

public class Question5 {

    public static void main(String[] args) {

        boolean c1 = false;
        boolean c2 = false;
        boolean c3 = false;
        boolean c4 = true;

        if(c1 || c2 || c3 || c4) {
            System.out.println("Reached OR");
        }

        boolean c5 = true;
        boolean c6 = true;
        boolean c7 = true;
        boolean c8 = true;

        if(c5 && c6 && c7 && c8) {
            System.out.println("Reached AND");
        }


    }
}
