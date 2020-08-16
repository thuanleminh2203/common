package com.venesa.common.DTO.crm.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CRMSendMessageRes implements Serializable {
    @JsonProperty("MessageId")
    private int messageId;
    @JsonProperty("PartnerId")
    private int partnerId;
    @JsonProperty("BrandName")
    private String brandName;
    @JsonProperty("Telco")
    private String telco;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Message")
    private String message;
}
