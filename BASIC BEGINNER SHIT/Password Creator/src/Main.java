// Password Creator

import java.util.Scanner;

public class Main {
    Helper helper = new Helper();
    Definitions defs = new Definitions();

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println();
            String option = menu();

            if (option.contains("1")) {
                quickCreate();
            }
            else if (option.contains("2")) {
                customCreate();
            }
            else if (option.contains("3")) {
                System.exit(67);
            }
            else {
                System.out.println("Invalid option selected, please try again.");
                continue;
            }
        }
    }

    public static String menu() throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("---Java Password Creation Tool---\n-----Please Select an Option-----");
        System.out.println("1) Quick Create\n2) Custom Create\n3) Exit");

        String selectOption = in.nextLine();
        return selectOption;
    }

    public static void quickCreate() throws Exception {
        Helper helper = new Helper();

        System.out.println("Password: " + helper.quickGenerate());
    }

    public static void customCreate() throws Exception {
        Helper helper = new Helper();

        System.out.println("Password: " + helper.customHandler());
    }
}
