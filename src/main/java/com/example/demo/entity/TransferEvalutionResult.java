package.com.example.demo.entity;

import jakarta presistence.*;

public class TransferEvalutionResult{
    @Id
    GenratedValue(Strategy=GenrationType.IDENTITY)
    private Long id;
    private Double minimumOverlapPercentage;
    private Int creditHourTolerance;
    private Boolean active;
    public TransferEvalutionResult(Long id, Double minimumOverlapPercentage, Int creditHourTolerance, Boolean active) {
        this.id = id;
        this.minimumOverlapPercentage = minimumOverlapPercentage;
        this.creditHourTolerance = creditHourTolerance;
        this.active = active;
    }
    public Long getId() {
        return id;
    }
    public Double getMinimumOverlapPercentage() {
        return minimumOverlapPercentage;
    }
    public Int getCreditHourTolerance() {
        return creditHourTolerance;
    }
    public Boolean getActive() {
        return active;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setMinimumOverlapPercentage(Double minimumOverlapPercentage) {
        this.minimumOverlapPercentage = minimumOverlapPercentage;
    }
    public void setCreditHourTolerance(Int creditHourTolerance) {
        this.creditHourTolerance = creditHourTolerance;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

}