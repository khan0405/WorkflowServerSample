package net.devkhan.workflowsample.dto;

/**
 * Created by KHAN on 2015-07-14.
 */
public class ApiResponse {
    private int result;
    private Object data;

    public ApiResponse() {
        this(200, null);
    }

    public ApiResponse(Object data) {
        this(200, data);
    }

    public ApiResponse(int result, Object data) {
        this.result = result;
        this.data = data;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
