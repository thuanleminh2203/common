package com.venesa.common.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListContractCreateRes implements Serializable {
    private List<ContractCreateRes> contract;
}
