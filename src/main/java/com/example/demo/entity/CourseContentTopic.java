package.com.example.demo.entity;

import jakarta presistence.*;

public class CourseContentTopic{
    public Long getId() {
        return id;
    }
    public String getTopicName() {
        return topicName;
    }
    public Double getWeightPercentage() {
        return weightPercentage;
    }
    @Id
    GenratedValue(Strategy=GenrationType.IDENTITY)
    private Long id;
    private String topicName;
    private Double weightPercentage;
    public CourseContentTopic(Long id, String topicName, Double weightPercentage) {
        this.id = id;
        this.topicName = topicName;
        this.weightPercentage = weightPercentage;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
    public void setWeightPercentage(Double weightPercentage) {
        this.weightPercentage = weightPercentage;
    }

}