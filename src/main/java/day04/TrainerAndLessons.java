package day04;

public class TrainerAndLessons {

    private String name;
    private String subject;
    private String schoolClass;
    private int NumberOfLessons;

    public TrainerAndLessons(String name, String subject, String schoolClass, int numberOfLessons) {
        this.name = name;
        this.subject = subject;
        this.schoolClass = schoolClass;
        NumberOfLessons = numberOfLessons;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    @Override
    public String toString() {
        return "TrainerAndLessons{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", schoolClass='" + schoolClass + '\'' +
                ", NumberOfLessons=" + NumberOfLessons +
                '}';
    }

    public int getNumberOfLessons() {
        return NumberOfLessons;
    }


}
