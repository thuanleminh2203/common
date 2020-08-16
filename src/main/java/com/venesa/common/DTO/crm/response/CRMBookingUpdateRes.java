package com.venesa.common.DTO.crm.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CRMBookingUpdateRes implements Serializable {
    private int bookingCode;
}
