package com.venesa.common.DTO.crm.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CRMMessageDTO implements Serializable {
    private int messageId;
    private int sendUnit;
    private String title;
    private String message;
    private String phoneNumber;
    private int type;
    private Date sendDate;
    private Date receiveDate;
    private int messageStatus;
    private String callbackUrl;
}
