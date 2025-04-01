package com.example.employement.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    private String message;
    private boolean success;
    private String status;
    private Object data;
    private List<String> errors;


    public static ApiResponse success(Object data) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(data);
        apiResponse.setSuccess(true);
        apiResponse.setMessage("Your request was successful");
        apiResponse.setStatus("SUCCESS");
        return apiResponse;
    }

    public static ApiResponse success(String message, Object data) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(data);
        apiResponse.setSuccess(true);
        apiResponse.setMessage(message);
        apiResponse.setStatus("SUCCESS");
        return apiResponse;
    }

    public static ApiResponse success (String message, String status, Object data) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(data);
        apiResponse.setSuccess(true);
        apiResponse.setMessage(message);
        apiResponse.setStatus(status);
        return apiResponse;
    }

    public static  ApiResponse error(String message) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setSuccess(false);
        apiResponse.setMessage(message);
        apiResponse.setStatus("ERROR");
        return apiResponse;
    }

    public static ApiResponse error(String message, String status) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setSuccess(false);
        apiResponse.setMessage(message);
        apiResponse.setStatus(status);
        return apiResponse;
    }

    public static ApiResponse error(String message, String status, List<String> errors) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setSuccess(false);
        apiResponse.setMessage(message);
        apiResponse.setStatus(status);
        apiResponse.setErrors(errors);
        return apiResponse;
    }

    public static ApiResponse error(String message, List<String> errors) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setSuccess(false);
        apiResponse.setMessage(message);
        apiResponse.setStatus("ERROR");
        apiResponse.setErrors(errors);
        return apiResponse;
    }
}
