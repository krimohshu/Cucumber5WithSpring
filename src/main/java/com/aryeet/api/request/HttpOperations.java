package com.aryeet.api.request;

public enum HttpOperations {
    GET("GET"), POST("POST"), PUT("PUT"), PATCH("PATCH"), DELETE("DELETE");
    private final String ops;

    HttpOperations(String ops) {
        this.ops = ops;
    }

    public static HttpOperations setOpertaion(String httpCall) {
        HttpOperations ops = null;
        httpCall = httpCall.toUpperCase();
        switch (httpCall) {
            case "GET":
                ops = GET;
                break;
            case "PUT":
                ops = PUT;
                break;
            case "POST":
                ops = POST;
                break;
            case "PATCH":
                ops = PATCH;
                break;

            case "DELETE":
                ops = DELETE;
                break;
            default:
                System.out.println("Unsupported http operation: " + httpCall);
        }
        return ops;
    }
}

