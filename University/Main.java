package University;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Kovalenko");
        s1.setRecordBookNumber(100001);
        s1.setAdmissionYear(2023);

        Student s2 = new Student("Olena", "Bondarenko", 100002);
        Student s3 = new Student("Andrii", "Kovalenko", 100003);

        Group empty = new Group(101, 2);
        System.out.println(empty.getGroupNumber() + " " + empty.getStudentsCount());

        Group group = new Group(202);
        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);

        System.out.println(group.getStudentByRecordBook(100002));

        for (Student s : group.getSortedStudents()) {
            System.out.println(s);
        }

        group.removeStudent(100001);
        System.out.println(group.getStudentsCount());
    }
}
