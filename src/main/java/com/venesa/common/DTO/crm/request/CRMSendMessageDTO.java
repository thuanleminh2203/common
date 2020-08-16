package com.venesa.common.DTO.crm.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CRMSendMessageDTO implements Serializable {
    private String message;
    private String phoneNumber;
}
