import java.util.ArrayList;

/**
 * GradeTracker class manages a collection of students and their grades.
 * It provides methods to add students, calculate statistics, and display summaries.
 */
public class GradeTracker {
    private ArrayList<Student> students;

    /**
     * Constructor initializes the ArrayList for storing students.
     */
    public GradeTracker() {
        students = new ArrayList<>();
    }

    /**
     * Adds a new student to the tracker.
     *
     * @param name  The student's name
     * @param grade The student's grade (0-100)
     */
    public void addStudent(String name, double grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("⚠️  Error: Grade must be between 0 and 100. Student not added.");
            return;
        }
        students.add(new Student(name, grade));
        System.out.println("✓ Student '" + name + "' added successfully.");
    }

    /**
     * Calculates the average grade of all students.
     *
     * @return The average grade, or 0 if no students exist
     */
    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum / students.size();
    }

    /**
     * Finds the highest grade among all students.
     *
     * @return The highest grade, or -1 if no students exist
     */
    public double getHighestGrade() {
        if (students.isEmpty()) {
            return -1;
        }
        double highest = students.get(0).getGrade();
        for (Student student : students) {
            if (student.getGrade() > highest) {
                highest = student.getGrade();
            }
        }
        return highest;
    }

    /**
     * Finds the lowest grade among all students.
     *
     * @return The lowest grade, or -1 if no students exist
     */
    public double getLowestGrade() {
        if (students.isEmpty()) {
            return -1;
        }
        double lowest = students.get(0).getGrade();
        for (Student student : students) {
            if (student.getGrade() < lowest) {
                lowest = student.getGrade();
            }
        }
        return lowest;
    }

    /**
     * Displays all students and their grades in a formatted table.
     */
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\n📋 No students in the tracker yet.\n");
            return;
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("📋 STUDENT GRADES SUMMARY");
        System.out.println("=".repeat(50));
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
        System.out.println("=".repeat(50) + "\n");
    }

    /**
     * Displays statistics about all students' grades.
     */
    public void displayStatistics() {
        if (students.isEmpty()) {
            System.out.println("\n⚠️  No students to calculate statistics.\n");
            return;
        }

        System.out.println("\n" + "-".repeat(50));
        System.out.println("📊 GRADE STATISTICS");
        System.out.println("-".repeat(50));
        System.out.println("Total Students: " + students.size());
        System.out.println(String.format("Average Grade: %.2f", calculateAverage()));
        System.out.println(String.format("Highest Grade: %.2f", getHighestGrade()));
        System.out.println(String.format("Lowest Grade: %.2f", getLowestGrade()));
        System.out.println("-".repeat(50) + "\n");
    }

    /**
     * Gets the total number of students in the tracker.
     *
     * @return The number of students
     */
    public int getTotalStudents() {
        return students.size();
    }

    /**
     * Removes a student from the tracker by name.
     *
     * @param name The name of the student to remove
     * @return true if the student was found and removed, false otherwise
     */
    public boolean removeStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                students.remove(student);
                System.out.println("✓ Student '" + name + "' removed successfully.");
                return true;
            }
        }
        System.out.println("⚠️  Student '" + name + "' not found.");
        return false;
    }
}
