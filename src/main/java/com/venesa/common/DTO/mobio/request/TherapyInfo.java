package com.venesa.common.DTO.mobio.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TherapyInfo implements Serializable {
    private String contractCode;
    private String productCode;
    private String branchCode;
    private String bookingCode;
    private String startTime;
    private String endTime;
    private Integer sessionNumber;
    private Integer sessionTotal;
    private Integer profileId;
}
