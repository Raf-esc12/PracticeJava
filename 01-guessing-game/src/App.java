import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Random r = new Random();
        int randomNumber = r.nextInt(100);          <- First solution with java.util.* 
        */
        int randomNumber =  (int)(Math.random() * 100);
        int playerNumber;
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 100");

        while(true){
        playerNumber = scanner.nextInt();
        if(playerNumber > randomNumber){
            System.out.println("Ο αριθμός που ψάχνεις είναι μικρότερος..");
        }
        else if(playerNumber < randomNumber){
            System.out.println("Ο αριθμός που ψάχνεις είναι μεγαλύτερος..");
        }
        else{
            System.out.println("Βρήκες τον αριθμό! Ηταν το: " + randomNumber);
            System.out.println("Θέλεις να συνεχίσεις: (Yes/No)");
            answer = scanner.next();
        }
        if(answer == "No")
                break;
            else
                System.out.println("Guess the number from 0 to 100");

        }
    }

}
