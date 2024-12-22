import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Random Numbers : ");
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(9000) + 1000;
            System.out.println(randomNum);
        }
    }
}