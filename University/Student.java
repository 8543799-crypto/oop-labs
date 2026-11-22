package University;

public class Student {
    public static final int DEFAULT_RECORD_BOOK = 0;
    public static final int DEFAULT_YEAR = 2024;

    private String firstName;
    private String lastName;
    private int admissionYear;
    private int recordBookNumber;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.recordBookNumber = DEFAULT_RECORD_BOOK;
        this.admissionYear = DEFAULT_YEAR;
    }

    public Student(String firstName, String lastName, int recordBookNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.recordBookNumber = recordBookNumber;
        this.admissionYear = DEFAULT_YEAR;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getRecordBookNumber() { return recordBookNumber; }
    public void setRecordBookNumber(int recordBookNumber) { this.recordBookNumber = recordBookNumber; }

    public int getAdmissionYear() { return admissionYear; }
    public void setAdmissionYear(int admissionYear) { this.admissionYear = admissionYear; }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + recordBookNumber + " " + admissionYear;
    }
}
