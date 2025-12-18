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
}
