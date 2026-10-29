import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Random r = new Random();
        int randomNumber = r.nextInt(100);          <- First solution with java.util.* 
        */
        int randomNumber =  (int)(Math.random() * 100);
        int playerNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 100");
        do{
        playerNumber = scanner.nextInt();
        if(playerNumber > randomNumber){
            System.out.println("Ο αριθμός που ψάχνεις είναι μικρότερος..");
        }
        else if(playerNumber < randomNumber){
            System.out.println("Ο αριθμός που ψάχνεις είναι μεγαλύτερος..");
        }
        else
            System.out.println("Βρήκες τον αριθμό! Ηταν το: " + randomNumber);
        }while(playerNumber != randomNumber);
    }

}
