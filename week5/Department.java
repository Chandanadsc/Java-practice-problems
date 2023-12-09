package week5;

class Department {
private static int stuCount = 0;
private Student1[] students = new Student1[100];
public Department() {
	// TODO Auto-generated constructor stub
}

public void addNewStudent(Student1 student) {
    if (stuCount < 100) {
        students[stuCount] = student;
        stuCount++;
    } else {
        System.out.println("Department is full");
    }
}

public void printAllStudents() {
    for (int i = 0; i < stuCount; i++) {
        System.out.println(students[i]);
    }
}

public void searchStudentID(String ID) {
    for (int i = 0; i < stuCount; i++) {
        if (students[i].getID().equals(ID)) {
            System.out.println(students[i]);
            return;
        }
    }
    System.out.println("Student not found");
}

public void searchStudentName(String name) {
    for (int i = 0; i < stuCount; i++) {
        if (students[i].getName().equalsIgnoreCase(name)) {
            System.out.println(students[i]);
            return;
        }
    }
    System.out.println("Student not found");
}

public void modifyName(String ID, String newName) {
    for (int i = 0; i < stuCount; i++) {
        if (students[i].getID().equals(ID)) {
            students[i].setName(newName);
            System.out.println("Name modified successfully");
            return;
        }
    }
    System.out.println("Student not found");
}
}
