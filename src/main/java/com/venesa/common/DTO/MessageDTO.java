package com.venesa.common.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpMethod;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  MessageDTO<T> implements Serializable {
    private String type;
    private HttpMethod method;
    private T message;
}
