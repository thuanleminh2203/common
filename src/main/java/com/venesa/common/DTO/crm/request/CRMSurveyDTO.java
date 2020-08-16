package com.venesa.common.DTO.crm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class CRMSurveyDTO {

    private int surveyId;

    private String appointmentId;

    private String contractCode;

    private String customerCode;

    private int rating;

    private String reason;

    private String note;

    private Date rateTime;

    private int type;
}