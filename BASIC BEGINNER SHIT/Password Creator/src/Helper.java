import java.util.Random;
import java.util.Scanner;

public class Helper {
    Definitions defs = new Definitions();

    public String generate(int defaultLength, String allowedChars) throws Exception {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        String password = "";

        for (int i=0; i < defaultLength; i++) {
            int index = random.nextInt(allowedChars.length()); // Random int up to the allowed chars length
            char randomChar = allowedChars.charAt(index); // Select character at the index

            sb.append(randomChar); // Append character to StringBuilder
        }
        password = sb.toString(); // Build String based off chars appended.

        return password;
    }

    public String customMenu() throws Exception {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("---------Custom Password---------");
            System.out.println("1) Generate\n2) Change Char List\n3) Change Length\n4) Change Probability\n5) Back\n6) Exit\n-----Please Select an option-----");

            String selectOption = in.nextLine();

            System.out.println();

            if (selectOption.contains("1")) { // Generate
                return generate(getDefaultLength(), getAllowedChars());
            }
            else if (selectOption.contains("2")) { // Change Chars
                System.out.print("Enter allowed characters: ");
                String newChars = in.nextLine();

                defs.changeAllowedChars(newChars);
                continue;
            }
            else if (selectOption.contains("3")) { // Change Length
                try {
                    System.out.print("Enter length of password: ");
                    int newLength = in.nextInt();

                    defs.changeDefaultLength(newLength);
                } catch (Exception e) {
                    System.out.println("Incorrect input received");
                } continue;
            }
            else if (selectOption.contains("4")) { // Change Probability
                System.out.println("To be programmed...");
            }
            else if (selectOption.contains("5")) { // Back
                Main.menu();
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

    public String complianceMenu() throws Exception {
        Scanner in = new Scanner(System.in);

        while (true) {
            String result = "";
            System.out.println("-------Compliance Password-------");
            System.out.println("1) Cyber Essentials\n2) ISO 27001\n3) NIST SP 800-63B\n4) PCI-DSS\n5) Back\n6) Exit\n-----Please Select an option-----");

            String selectOption = in.nextLine();

            System.out.println();

            if (selectOption.contains("1")) { // // Cyber Essentials
                result = generate(12, getAllowedChars());
                System.out.println("Please ensure password expiry is disabled and this password is not reused. Lockout policy must also be enabled.");
            }
            else if (selectOption.contains("2")) { // ISO 27001
                result = generate(16, getAllowedChars());
                System.out.println("Please ensure password expiry is set to 90-180-day rotation and enforce password history.");
            }
            else if (selectOption.contains("3")) { // NIST SP 800-638
                result = generate(14, getAllowedChars());
                System.out.println("Please ensure password expiry is disabled.");
            }
            else if (selectOption.contains("4")) { // PCI-DSS
                result = generate(12, getAllowedChars());
                System.out.println("Please ensure password expiry is set to 90-day rotation and lockout policy is enabled.");
            }
            else if (selectOption.contains("5")) { // Back
                Main.menu();
            }
            else if (selectOption.contains("6")) { // Exit
                System.exit(420);
            }
            else {
                System.out.println("Invalid option selected, please try again.");  
            } return result;
        }
    }

    public String getAllowedChars() {
        return defs.allowedChars;
    }
    
    public int getDefaultLength() {
        return defs.defaultLength;
    }
}