import java.util.Scanner;

class Student {
    private int studentID;
    private String name;
    private String major;
    private long phoneNumber;

    // 생성자
    public Student(int studentID, String name, String major, long phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    // 학번 getter / setter
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // 이름 getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 전공 getter / setter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // 전화번호 getter / setter
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // 전화번호를 010-xxxx-xxxx 형태로 변환
    public String getFormattedPhoneNumber() {
        String phone = Long.toString(phoneNumber);

        // 앞자리 0 복구
        phone = "0" + phone;

        return phone.substring(0, 3) + "-"
                + phone.substring(3, 7) + "-"
                + phone.substring(7, 11);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        // 학생 3명의 정보 입력
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            int studentID = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            long phoneNumber = Long.parseLong(scanner.next());

            students[i] = new Student(
                    studentID,
                    name,
                    major,
                    phoneNumber
            );
        }

        // 결과 출력
        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            System.out.println(
                    (i + 1) + "번째 학생: "
                    + students[i].getStudentID() + " "
                    + students[i].getName() + " "
                    + students[i].getMajor() + " "
                    + students[i].getFormattedPhoneNumber()
            );
        }

        scanner.close();
    }
}