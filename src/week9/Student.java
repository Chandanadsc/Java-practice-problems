package week9;

class Student implements Comparable<Student> {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student other) {
        // Compare students based on their marks
        if (this.marks == other.marks) {
            // If marks are equal, sort based on student ID
            return this.name.compareTo(other.name);
        } else {
            return Integer.compare(this.marks, other.marks);
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + this.name + ", Marks: " + marks;
    }

	
}