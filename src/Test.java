public class Test {
    public static void main(String[] args) {
        DateOfBirth d1 = new DateOfBirth(11,12,2011);
        DateOfBirth d2 = new DateOfBirth(12,12,2012);
        DateOfBirth d3 = new DateOfBirth(13,12,2013);

        Course c1 = new Course("Physics","Natural");
        Course c2 = new Course("Mathematics","Natural");
        Course c3 = new Course("Literature","Social");

        Student s1 = new Student("thinv1990","Van Thi",d1,5.2,c1);
        Student s2 = new Student("vuongnv2000","Van Vuong",d2,4.9,c3);
        Student s3 = new Student("quyetld2013","Le Quyet",d3,7.9,c2);

        System.out.println("The faculty of student s1 is: " + s1.getFacultyName());
        System.out.println("Student named " +s2.getFullName() + " is: " + (s2.checkPassOrNot()?"Passed":"Not passed"));
        System.out.println("The day of birth of s1 is same to s2 ? " + (s1.checkDayOfBirthSameOrNot(s2)?"Oh!It's the same":"No,It's not same!"));


    }
}
