public class Course {
    private String courseName;
    private String facultyName;

    public Course(String courseName, String facultyName) {
        this.courseName = courseName;
        this.facultyName = facultyName;
    }

//    set &get


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
