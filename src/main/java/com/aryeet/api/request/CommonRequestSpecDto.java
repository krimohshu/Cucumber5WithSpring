package com.aryeet.api.request;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;
import java.util.Map;

@Component
public class CommonRequestSpecDto {

    private String endPoint;
    private String apiParameters;
    private String requestBodyJsonPath;
    private String payloadLocation;
    private Headers headers;
    private boolean headerCondition=false;
    private HttpOperations operation;

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getApiParameters() {
        return apiParameters;
    }

    public void setApiParameters(String apiParameters) {
        this.apiParameters = apiParameters;
    }

    public String getRequestBodyJsonPath() {
        return requestBodyJsonPath;
    }

    public void setRequestBodyJsonPath(String requestBodyJsonPath) {
        this.requestBodyJsonPath = requestBodyJsonPath;
    }

    public String getPayloadLocation() {
        return payloadLocation;
    }

    public void setPayloadLocation(String payloadLocation) {
        this.payloadLocation = payloadLocation;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public boolean isHeaderCondition() {
        return headerCondition;
    }

    public void setHeaderCondition(boolean headerCondition) {
        this.headerCondition = headerCondition;
    }

    public HttpOperations getOperation() {
        return operation;
    }

    public void setOperation(HttpOperations operation) {
        this.operation = operation;
    }
}
