import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random randRoll = new Random();
        int x = randRoll.nextInt(6) + 1;

        System.out.println("You rolled a " + x);
    }
}