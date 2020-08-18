package com.venesa.common.DTO.crm.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CRMUserDTO implements Serializable {
    private String mobileId;

    private String fullName;

    private String mobile;

    private String email;

    private String identifyCode;

    private int gender;

    private String birthday;

    private int cardId;

    private String cardCode;

    private int identifyType;

    private String provinceCode;
}
