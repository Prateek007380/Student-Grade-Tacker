import java.util.Scanner;

/**
 * Main class provides a console-based interface for the Student Grade Tracker.
 * Users can interact with the program through a menu-driven system.
 */
public class Main {
    private static GradeTracker tracker;
    private static Scanner scanner;

    /**
     * Main method - entry point of the program.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        tracker = new GradeTracker();
        scanner = new Scanner(System.in);

        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║   WELCOME TO STUDENT GRADE TRACKER 📚      ║");
        System.out.println("╚════════════════════════════════════════════╝\n");

        boolean isRunning = true;
        while (isRunning) {
            displayMenu();
            int choice = getValidIntInput();
            isRunning = handleMenuChoice(choice);
        }

        scanner.close();
        System.out.println("\n👋 Thank you for using Student Grade Tracker. Goodbye!\n");
    }

    /**
     * Displays the main menu options.
     */
    private static void displayMenu() {
        System.out.println("\n┌─ MAIN MENU ─────────────────────┐");
        System.out.println("│ 1. Add a student and grade      │");
        System.out.println("│ 2. Display all students         │");
        System.out.println("│ 3. Show grade statistics        │");
        System.out.println("│ 4. Remove a student             │");
        System.out.println("│ 5. Exit                         │");
        System.out.println("└─────────────────────────────────┘");
        System.out.print("Enter your choice (1-5): ");
    }

    /**
     * Handles the user's menu choice.
     *
     * @param choice The user's menu selection
     * @return true to continue running, false to exit
     */
    private static boolean handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addStudentMenu();
                break;
            case 2:
                tracker.displayAllStudents();
                break;
            case 3:
                tracker.displayStatistics();
                break;
            case 4:
                removeStudentMenu();
                break;
            case 5:
                return false;
            default:
                System.out.println("\n⚠️  Invalid choice. Please enter a number between 1 and 5.");
        }
        return true;
    }

    /**
     * Prompts the user to add a new student with their grade.
     */
    private static void addStudentMenu() {
        System.out.print("\nEnter student name: ");
        scanner.nextLine(); // Clear the input buffer
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("⚠️  Error: Student name cannot be empty.");
            return;
        }

        System.out.print("Enter grade (0-100): ");
        double grade = getValidDoubleInput();
        tracker.addStudent(name, grade);
    }

    /**
     * Prompts the user to remove a student.
     */
    private static void removeStudentMenu() {
        System.out.print("\nEnter the name of the student to remove: ");
        scanner.nextLine(); // Clear the input buffer
        String name = scanner.nextLine().trim();
        tracker.removeStudent(name);
    }

    /**
     * Gets a valid integer input from the user.
     *
     * @return A valid integer entered by the user
     */
    private static int getValidIntInput() {
        int input = -1;
        try {
            input = scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Clear invalid input
            System.out.println("⚠️  Invalid input. Please enter a valid number.");
        }
        return input;
    }

    /**
     * Gets a valid double (decimal) input from the user.
     *
     * @return A valid double entered by the user
     */
    private static double getValidDoubleInput() {
        double input = -1;
        try {
            input = scanner.nextDouble();
            if (input < 0 || input > 100) {
                System.out.println("⚠️  Grade must be between 0 and 100. Please try again.");
                return getValidDoubleInput();
            }
        } catch (Exception e) {
            scanner.nextLine(); // Clear invalid input
            System.out.println("⚠️  Invalid input. Please enter a valid number.");
            return getValidDoubleInput();
        }
        return input;
    }
}
