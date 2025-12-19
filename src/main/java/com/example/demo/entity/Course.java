package.com.example.demo.entity;

public class Course{
    @Id
    GenratedValue(Strategy=GenrationType.IDENTITY)
    private Long Id;
    private String coursecode;
    private String courseName;
    private Int creditHours;
    private String description;
    private String department;
    private Boolean active;
    public Course(Long id, String coursecode, String courseName, Int creditHours, String description, String department,
            Boolean active) {
        Id = id;
        this.coursecode = coursecode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.description = description;
        this.department = department;
        this.active = active;
    }
    public Long getId() {
        return Id;
    }
    public String getCoursecode() {
        return coursecode;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCreditHours(Int creditHours) {
        this.creditHours = creditHours;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public String getCourseName() {
        return courseName;
    }
    public Int getCreditHours() {
        return creditHours;
    }
    public String getDescription() {
        return description;
    }
    public String getDepartment() {
        return department;
    }
    public Boolean getActive() {
        return active;
    }
}
