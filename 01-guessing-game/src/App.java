import java.util.Random;
import java.util.Scanner;

public class App {
    private static final int MAX_NUMBER = 100;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean playAgain;
            do {
                playRound(scanner);
                playAgain = askPlayAgain(scanner);
            } while (playAgain);
        }
        System.out.println("Ευχαριστώ που έπαιξες!");
    }

    private static void playRound(Scanner scanner) {
        int target = RANDOM.nextInt(1, MAX_NUMBER + 1);
        System.out.println("Μάντεψε τον αριθμό από 1 έως " + MAX_NUMBER);

        int guess;
        do {
            guess = readInt(scanner);
            if (guess > target) {
                System.out.println("Ο αριθμός που ψάχνεις είναι μικρότερος...");
            } else if (guess < target) {
                System.out.println("Ο αριθμός που ψάχνεις είναι μεγαλύτερος...");
            }
        } while (guess != target);

        System.out.println("Βρήκες τον αριθμό! Ήταν το " + target);
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Αυτός δεν είναι αριθμός! Προσπάθησε ξανά.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static boolean askPlayAgain(Scanner scanner) {
        System.out.println("Θέλεις να ξαναπαίξεις; (yes/no)");
        return scanner.next().equalsIgnoreCase("yes");
    }
}