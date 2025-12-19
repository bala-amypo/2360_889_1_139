package.com.example.demo.entity;

import jakarta presistence.*;

public class TransferRules{
    @Id
    GenratedValue(Strategy=GenrationType.IDENTITY)
    private Long id;
    private Double overlapPercentage;
    private Int creditHourDifference;
    private Boolean isEligibleForTransfer;
    private String notes;
    public TransferRules(Long id, Double overlapPercentage, Int creditHourDifference, Boolean isEligibleForTransfer,
            String notes) {
        this.id = id;
        this.overlapPercentage = overlapPercentage;
        this.creditHourDifference = creditHourDifference;
        this.isEligibleForTransfer = isEligibleForTransfer;
        this.notes = notes;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setOverlapPercentage(Double overlapPercentage) {
        this.overlapPercentage = overlapPercentage;
    }
    public void setCreditHourDifference(Int creditHourDifference) {
        this.creditHourDifference = creditHourDifference;
    }
    public void setIsEligibleForTransfer(Boolean isEligibleForTransfer) {
        this.isEligibleForTransfer = isEligibleForTransfer;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public Long getId() {
        return id;
    }
    public Double getOverlapPercentage() {
        return overlapPercentage;
    }
    public Int getCreditHourDifference() {
        return creditHourDifference;
    }
    public Boolean getIsEligibleForTransfer() {
        return isEligibleForTransfer;
    }
    public String getNotes() {
        return notes;
    }

}
