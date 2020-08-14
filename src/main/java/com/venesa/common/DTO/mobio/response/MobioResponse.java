package com.venesa.common.DTO.mobio.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class MobioResponse<T> implements Serializable {
    private String code;
    private String message;
    private T data;
}
