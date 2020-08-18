package com.venesa.common.DTO.crm.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CRMWorkShiftRes implements Serializable {
    List<Integer> listWorkShift;
}
