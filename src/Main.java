import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {

            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles rectangle");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int choice2 = -1;
                    do {
                        System.out.println("1. TOP - LEFT");
                        System.out.println("2. TOP - RIGHT");
                        System.out.println("3. BOTTOM - LEFT");
                        System.out.println("4. BOTTOM - RIGHT");
                        System.out.println("5. EXIT");
                        choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1:
                                for (int i = 4; i >= 1; i--) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("   ");
                                    }
                                    for (int j = 0; j < 4 - i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (int i = 1; i <= 4; i++) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                for (int i = 1; i <= 4; i++) {
                                    for (int j = 0; j < 4 - i; j++) {
                                        System.out.print("   ");
                                    }
                                    for (int j = 0; j < i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    } while (choice2 != 5);
                    break;
                case 3:
                    int choice3 = -1;
                    while (choice3 != 5) {
                        System.out.println("1. UP");
                        System.out.println("2. DOWN");
                        System.out.println("3. LEFT");
                        System.out.println("4. RIGHT");
                        System.out.println("5. EXIT");
                        choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1:
                                for (int i = 1; i <= 4; i++) {
                                    for (int j = 0; j < 4 - i; j++) {
                                        System.out.print("   ");
                                    }
                                    for (int j = 0; j < i * 2 - 1; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("   ");
                                    }
                                    for (int j = 0; j < 7 - 2 * i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (int i = 1; i <= 4; i++) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                for (int i = 3; i >= 1; i--) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                for (int i = 1; i <= 4; i++) {
                                    for (int j = 0; j < 4 - i; j++) {
                                        System.out.print("   ");
                                    }
                                    for (int j = 0; j < i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < i + 1; j++) {
                                        System.out.print("   ");
                                    }
                                    for (int j = 0; j < 3 - i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}