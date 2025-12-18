package.com.example.demo.entity;

import jakarta presistence.*;

public class TransferEvalutionResult{
    @Id
    GenratedValue(Strategy=GenrationType.IDENTITY)
    private Long id;
    private Double minimumOverlapPercentage;
    private Int creditHourTolerance;
    private Boolean active;

}