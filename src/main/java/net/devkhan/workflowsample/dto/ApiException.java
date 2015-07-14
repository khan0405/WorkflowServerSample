package net.devkhan.workflowsample.dto;

/**
 * Created by KHAN on 2015-07-14.
 */
public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}
