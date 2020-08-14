package com.venesa.common.DTO.crm;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CRMCustomer implements Serializable {
    private  String mobileId;
    private String fullName;
    private String mobile;
    private String email;
    private String idCardNo;
    private Integer gender;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+07:00")
    private Date birthday;
    private String provinceCode;

}
