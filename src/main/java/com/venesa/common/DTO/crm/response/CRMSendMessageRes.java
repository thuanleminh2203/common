package com.venesa.common.DTO.crm.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CRMSendMessageRes implements Serializable {
    private String MessageId;
    private String PartnerId;
    private String BrandName;
    private String Telco;
    private String Phone;
    private String Message;
}
