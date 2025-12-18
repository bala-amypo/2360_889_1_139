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

}