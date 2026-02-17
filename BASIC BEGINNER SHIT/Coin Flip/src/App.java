import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        int choice = rand.nextInt(2);
        System.out.println(choice);

        if (choice == 0) {
            System.out.println("Seth");
        }
        
        else if (choice == 1) {
            System.out.println("Logan");
        }
    }
}
