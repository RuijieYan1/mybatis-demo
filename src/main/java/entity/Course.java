package entity;

public class Course {
    private Integer id;
    private String courseNo;
    private String courseName;
    private Integer studentId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCourseNo() {
        return courseNo;
    }
    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
