public class Student {
    private String id ;
    private String fullName ;
    private DateOfBirth dayOfBirth ;
    private double averagePoint ;

    private Course course ;

//    constructors


    public Student(String id, String fullName, DateOfBirth dayOfBirth, double averagePoint, Course course) {
        this.id = id;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.averagePoint = averagePoint;
        this.course = course;
    }

//    get & set


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DateOfBirth getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(DateOfBirth dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

//    methods
    public String getFacultyName(){
        return this.course.getFacultyName();
    }

    public boolean checkPassOrNot(){

        return this.averagePoint>=5;

    }

    public boolean checkDayOfBirthSameOrNot(Student other) {

        return this.dayOfBirth == other.dayOfBirth;

    }
}
