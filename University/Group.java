package University;

import java.util.Arrays;

public class Group {
    public static final int DEFAULT_GROUP = 0;
    public static final int DEFAULT_COUNT = 0;

    private int groupNumber;
    private Student[] students;

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new Student[DEFAULT_COUNT];
    }

    public Group(int groupNumber, int studentsCount) {
        this.groupNumber = groupNumber;
        this.students = new Student[studentsCount];
    }

    public Group(Student[] students) {
        this.groupNumber = DEFAULT_GROUP;
        this.students = (students != null) ? students : new Student[DEFAULT_COUNT];
    }

    public int getGroupNumber() { return groupNumber; }
    public void setGroupNumber(int groupNumber) { this.groupNumber = groupNumber; }

    public int getStudentsCount() { return students.length; }

    public Student getStudentByRecordBook(int recordBookNumber) {
        for (Student s : students) {
            if (s != null && s.getRecordBookNumber() == recordBookNumber) return s;
        }
        return null;
    }

    public void removeStudent(int recordBookNumber) {
        int idx = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getRecordBookNumber() == recordBookNumber) {
                idx = i;
                break;
            }
        }
        if (idx == -1) return;

        Student[] res = new Student[students.length - 1];
        for (int i = 0, j = 0; i < students.length; i++) {
            if (i != idx) res[j++] = students[i];
        }
        students = res;
    }

    public void addStudent(Student student) {
        Student[] res = Arrays.copyOf(students, students.length + 1);
        res[students.length] = student;
        students = res;
    }

    public Student[] getStudents() { return students; }

    public Student[] getSortedStudents() {
        Student[] sorted = Arrays.copyOf(students, students.length);
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] != null && sorted[j + 1] != null) {
                    int cmp = sorted[j].getLastName().compareToIgnoreCase(sorted[j + 1].getLastName());
                    if (cmp > 0 || (cmp == 0 && sorted[j].getFirstName().compareToIgnoreCase(sorted[j + 1].getFirstName()) > 0)) {
                        Student tmp = sorted[j];
                        sorted[j] = sorted[j + 1];
                        sorted[j + 1] = tmp;
                    }
                }
            }
        }
        return sorted;
    }
}
