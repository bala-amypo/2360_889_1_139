package.com.example.demo.entity;

import jakarta presistence.*;

public class CourseContentTopic{
    @Id
    GenratedValue(Strategy=GenrationType.IDENTITY)
    private Long id;
    private String topicName;
    private Double weightPercentage;

}