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
public class MobioCustomerUpdateRq implements Serializable {
    private String phoneNumber;
    private String email;
    private String fullName;
    private String profileId;
    private String address;
    private String birthday;
    private Integer gender;
    private String identifyType;
    private String identifyCode;
    private String provinceCode;
}
