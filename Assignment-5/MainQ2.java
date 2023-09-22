public class MainQ2 {
    public static void main(String[] args) {
        // Create a new course
        Course CricketCourse = new Course("Cricket");

        // Add students to the course
        CricketCourse.addStudent("Virat");
        CricketCourse.addStudent("Rahul");
        CricketCourse.addStudent("Rohit");
        CricketCourse.addStudent("Shubhman");

        // Display the course name
        System.out.println("Course Name: " + CricketCourse.getCourseName());

        // Display the number of students in the course
        System.out.println("Number of Students: " + CricketCourse.getNumberOfStudents());

        // Display the list of students in the course
        System.out.println("Students Enrolled:");
        String[] students = CricketCourse.getStudents();
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }

        // Drop a student from the course
        CricketCourse.dropStudent("Rohit");

        // Display the updated list of students and the new number of students
        System.out.println("\nStudents Enrolled after Dropping:");
        students = CricketCourse.getStudents();
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println("Number of Students after Dropping: " + CricketCourse.getNumberOfStudents());
    }
}
