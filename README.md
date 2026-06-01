# Student Grade Tracker 📚

A simple console-based Java application for managing student grades and calculating basic statistics.

## Project Structure

```
StudentGradeTracker/
├── src/
│   ├── Student.java       - Represents a single student with name and grade
│   ├── GradeTracker.java  - Manages collection of students and operations
│   └── Main.java          - Console interface and menu system
└── README.md              - This file
```

## Features

✅ **Add Students**: Input student names and grades (0-100)  
✅ **View All Students**: Display a formatted list of all students and grades  
✅ **Grade Statistics**: Calculate average, highest, and lowest scores  
✅ **Remove Students**: Delete students from the tracker  
✅ **Input Validation**: Ensures grades are within valid range  
✅ **User-Friendly Menu**: Interactive console-based interface  

## How to Compile and Run

### Using Command Prompt/PowerShell:

1. **Navigate to the src directory:**
   ```
   cd d:\Java CA task 1\StudentGradeTracker\src
   ```

2. **Compile all Java files:**
   ```
   javac *.java
   ```

3. **Run the program:**
   ```
   java Main
   ```

### Alternative: Compile and run in one step:
```
javac *.java && java Main
```

## Using the Program

When you run the program, you'll see a menu with the following options:

1. **Add a student and grade** - Enter student name and grade
2. **Display all students** - View list of all students
3. **Show grade statistics** - See average, highest, and lowest grades
4. **Remove a student** - Delete a student from the tracker
5. **Exit** - Close the program

## Example Usage

```
Welcome to Student Grade Tracker

┌─ MAIN MENU ─────────────────────┐
│ 1. Add a student and grade      │
│ 2. Display all students         │
│ 3. Show grade statistics        │
│ 4. Remove a student             │
│ 5. Exit                         │
└─────────────────────────────────┘

Enter your choice (1-5): 1
Enter student name: Alice
Enter grade (0-100): 95
✓ Student 'Alice' added successfully.
```

## Code Learning Points

### 1. **Student.java**
- Demonstrates encapsulation with private fields
- Shows getters and setters for data access
- Includes `@Override toString()` for custom string representation

### 2. **GradeTracker.java**
- Uses `ArrayList<Student>` for dynamic collection management
- Implements methods for:
  - Adding and removing students
  - Calculating statistics (average, max, min)
  - Displaying formatted output
- Shows iteration using enhanced for loops

### 3. **Main.java**
- Console I/O using `Scanner` class
- Menu-driven application structure
- Input validation and error handling
- Exception handling for invalid inputs

## Data Structures Used

- **ArrayList**: Dynamic array that grows as needed to store Student objects
- **String**: For student names
- **double**: For storing grades with decimal precision

## Future Enhancements

You could extend this project with:
- **File I/O**: Save and load student data from files
- **Sorting**: Sort students by grade or name
- **Grade Distribution**: Show how many students got A's, B's, etc.
- **GUI**: Convert to a graphical interface using Swing or JavaFX
- **Search**: Find students by name
- **Update Grades**: Modify existing student grades
- **Import CSV**: Load student data from CSV files

## Requirements

- **Java 8 or higher** installed on your system
- A text editor or IDE (VS Code, Eclipse, IntelliJ, etc.)
- Command prompt/terminal access

## Tips for Learning

1. **Trace through the code**: Use print statements to understand the flow
2. **Modify features**: Try adding new methods like sorting or filtering
3. **Handle edge cases**: What happens with empty input or invalid numbers?
4. **Explore ArrayList methods**: Check Java documentation for more ArrayList features

---

Happy Learning! 🚀
