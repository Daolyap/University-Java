// Password Creator
// ToDo: Probability
// ToDo: Amount of passwords

import java.util.Scanner;

public class Main {
    static Definitions defs = new Definitions(); // Single source of definitions
    static Helper helper = new Helper(defs); // Pass over definitions

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("---Java Password Creation Tool---");
            System.out.println("1) Quick Create\n2) Custom Create\n3) Compliance Selection \n4) Exit\n-----Please Select an Option-----");

            String selectOption = in.nextLine();
            System.out.println();

            if (selectOption.contains("1")) {
                quickCreate();
            }
            else if (selectOption.contains("2")) {
                customCreate();
            }
            else if (selectOption.contains("3")) {
                complianceCreate();
            }
            else if (selectOption.contains("4")) {
                System.exit(67);
            }
            else {
                System.out.println("Invalid option selected, please try again.");
                continue;
            }
        }
    }

    private static void quickCreate() throws Exception {
        helper.generate(helper.getDefaultLength(), helper.getAllowedChars());
    }

    private static void customCreate() throws Exception {
        helper.customMenu();
    }

    private static void complianceCreate() throws Exception {
        helper.complianceMenu();
    }
}
