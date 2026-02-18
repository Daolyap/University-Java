import java.util.Random;
import java.util.Scanner;

public class Helper {
    // Definitions defs = new Definitions(); this should be passed down from main, for consistent results.
    Definitions defs; // Declared as a Placeholder: We wait for Main to give us the settings.

    public Helper(Definitions sharedDefs) { // Runs when static Helper helper = new Helper(defs);
        this.defs = sharedDefs;
    }

    public void generate(int defaultLength, String allowedChars) throws Exception {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        String password = "";

        for (int i=0; i < defaultLength; i++) {
            int index = random.nextInt(allowedChars.length()); // Random int up to the allowed chars length
            char randomChar = allowedChars.charAt(index); // Select character at the index

            sb.append(randomChar); // Append character to StringBuilder
        } password = sb.toString(); // Build String based off chars appended.

        System.out.println("Password: " + password);
    }

    public void generate(int defaultLength, String allowedChars, int amount) throws Exception {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        String password = "";

        for (int i=0; i < amount; i++){
            for (int x=0; x < defaultLength; x++) {
                int index = rand.nextInt(allowedChars.length());
                char randomChar = allowedChars.charAt(index);

                sb.append(randomChar);
            } password = sb.toString();
            System.out.println("Password " + (i+1) + ": " + password);
            sb.setLength(0);;
        }
    }

    public String customMenu() throws Exception {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("---------Custom Password---------");
            System.out.println("1) Generate\n2) Change Char List\n3) Change Length\n4) Change Probability\n5) Back\n6) Exit\n-----Please Select an option-----");

            String selectOption = in.nextLine();

            System.out.println();

            if (selectOption.contains("1")) { // Generate
                try {
                    System.out.print("How many passwords: ");
                    int amount = in.nextInt();

                    in.nextLine();

                    if (amount == 1) {
                        generate(getDefaultLength(), getAllowedChars());
                    } else {
                        generate(getDefaultLength(), getAllowedChars(), amount);
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            else if (selectOption.contains("2")) { // Change Chars
                System.out.print("Enter allowed characters: ");
                String newChars = in.nextLine();

                in.nextLine();

                defs.changeAllowedChars(newChars);
            }
            else if (selectOption.contains("3")) { // Change Length
                try {
                    System.out.print("Enter length of password: ");
                    int newLength = in.nextInt();

                    defs.changeDefaultLength(newLength);
                } catch (Exception e) {
                    System.out.println("Incorrect input received");
                }
            }
            else if (selectOption.contains("4")) { // Change Probability
                System.out.println("To be programmed...");
            }
            else if (selectOption.contains("5")) { // Back
                Main.main(null);
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

    public void complianceMenu() throws Exception {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("-------Compliance Password-------");
            System.out.println("1) Cyber Essentials\n2) ISO 27001\n3) NIST SP 800-63B\n4) PCI-DSS\n5) Back\n6) Exit\n-----Please Select an option-----");

            String selectOption = in.nextLine();

            System.out.println();

            if (selectOption.contains("1")) { // // Cyber Essentials
                generate(12, getAllowedChars());
                System.out.println("Please ensure password expiry is disabled and this password is not reused. Lockout policy must also be enabled.");
            }
            else if (selectOption.contains("2")) { // ISO 27001
                generate(16, getAllowedChars());
                System.out.println("Please ensure password expiry is set to 90-180-day rotation and enforce password history.");
            }
            else if (selectOption.contains("3")) { // NIST SP 800-638
                generate(14, getAllowedChars());
                System.out.println("Please ensure password expiry is disabled.");
            }
            else if (selectOption.contains("4")) { // PCI-DSS
                generate(12, getAllowedChars());
                System.out.println("Please ensure password expiry is set to 90-day rotation and lockout policy is enabled.");
            }
            else if (selectOption.contains("5")) { // Back
                // Main.main(null); This was my original code but is unsafe as it generates a stack and will cause a Stack Overflow.
                break; // Correct implementation
            }
            else if (selectOption.contains("6")) { // Exit
                System.exit(420);
            }
            else {
                System.out.println("Invalid option selected, please try again.");  
            }
        }
    }

    public String getAllowedChars() {
        return defs.allowedChars;
    }
    
    public int getDefaultLength() {
        return defs.defaultLength;
    }
}