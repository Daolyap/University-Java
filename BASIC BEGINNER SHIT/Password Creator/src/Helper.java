import java.util.Random;
import java.util.Scanner;

public class Helper {
    Definitions defs = new Definitions();

    public String quickGenerate() throws Exception {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        String password = "";

        for (int i=0; i < defs.getDefaultLength(); i++) {
            int index = random.nextInt(defs.getAllowedChars().length());
            char randomChar = defs.getAllowedChars().charAt(index);

            sb.append(randomChar);
        }
        password = sb.toString();

        return password;
    }

    public String customHandler() throws Exception {
        String finalPassword = menu();

        return finalPassword;
    }

    private String menu() throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("------Option 2 Selected------\n-----Please Select an option-----");
        System.out.println("1) Generate\n2) Change Char List\n3) Change Length\n4) Change Probability\n5) Back\n6) Exit");

        String selectOption = in.nextLine();

        while (true) {
            System.out.println();

            if (selectOption.contains("1")) { // Generate
                customGenerate();
            }
            else if (selectOption.contains("2")) { // Change Chars

            }
            else if (selectOption.contains("3")) { // Change Length

            }
            else if (selectOption.contains("4")) { // Change Probability

            }
            else if (selectOption.contains("5")) { // Back

            }
            else if (selectOption.contains("6")) { // Exit
                System.exit(420);
            }
            else {
                System.out.println("Invalid option selected, please try again.");
                continue;   
            }
        }
    }

    private String customGenerate() throws Exception {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        String password = "";

        for (int i=0; i < defs.getDefaultLength(); i++) {
            
        }

        return password;
    }
}