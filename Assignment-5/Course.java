public class Course{
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[100]; // Assuming a maximum of 100 students initially
        this.numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents < students.length) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            System.out.println("Course is full. Cannot add more students.");
        }
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Shift the remaining elements to fill the gap
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null; // Clear the last element
                numberOfStudents--;
                return; // Student found and dropped
            }
        }
        System.out.println(student + " is not found in the course.");
    }

    public String[] getStudents() {
        String[] enrolledStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, enrolledStudents, 0, numberOfStudents);
        return enrolledStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}