/**
 * Student class represents a single student with their name and grade.
 * This class encapsulates student data and provides simple getters/setters.
 */
public class Student {
    private String name;
    private double grade;

    /**
     * Constructor to initialize a Student object.
     *
     * @param name  The student's name
     * @param grade The student's grade (0-100)
     */
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    /**
     * Gets the student's name.
     *
     * @return The student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     *
     * @param name The new name for the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the student's grade.
     *
     * @return The student's grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Sets the student's grade.
     *
     * @param grade The new grade for the student
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * Returns a string representation of the student.
     *
     * @return A formatted string with the student's name and grade
     */
    @Override
    public String toString() {
        return String.format("%-20s | Grade: %.2f", name, grade);
    }
}
