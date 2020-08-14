package com.venesa.common.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.venesa.common.DTO.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class WebClientUtils {
    @Autowired
    private WebClient webClient;

    /**
     * @param <T>
     * @param <V>
     * @param type
     * @param body
     * @param method
     * @param url
     * @param tClass
     * @param token
     * @return
     * @throws Exception
     */
    public <T, V> T callInternalService(ParameterizedTypeReference<T> type, V body, HttpMethod method, String url,
                                        Class<T> tClass, String token) throws Exception {
        T dto = null;
        ResponseData responseData = webClient.method(method).uri(url)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .header(HttpHeaders.AUTHORIZATION, token).accept(MediaType.APPLICATION_JSON)
                .body(Mono.justOrEmpty(body), type)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, clientResponse ->
                        clientResponse.bodyToMono(ResponseData.class).flatMap(response ->
                                Mono.error(new Exception(response.getErrorMessage()))
                        )
                )
                .onStatus(HttpStatus::is5xxServerError, clientResponse ->
                        clientResponse.bodyToMono(ResponseData.class).flatMap(response ->
                                Mono.error(new Exception(response.getErrorMessage()))
                        ))
                .bodyToMono(ResponseData.class).block();
        ObjectMapper objectMapper = new ObjectMapper();

        dto = objectMapper.convertValue(responseData, tClass);
        return dto;
    }
}