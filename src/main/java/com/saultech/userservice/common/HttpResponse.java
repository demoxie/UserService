package com.saultech.common;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class HttpResponse{
    private HttpStatus status;
    private int statusCode;
    private HttpHeaders headers;
    private String message;
    private ResponseBody<?> body;
}
