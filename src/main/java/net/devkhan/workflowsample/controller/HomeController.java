package net.devkhan.workflowsample.controller;

import net.devkhan.workflowsample.dto.ApiException;
import net.devkhan.workflowsample.dto.ApiResponse;
import net.devkhan.workflowsample.dto.MobileVersion;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by KHAN on 2015-07-14.
 */
@RestController
@RequestMapping
public class HomeController {

    @RequestMapping("/")
    public ApiResponse home() {
        return new ApiResponse("Hello world!");
    }

    @RequestMapping("/mobileVersion")
    public ApiResponse mobileVersion() {
        return new ApiResponse(new MobileVersion("1.0.0", "1.0.0"));
    }

    @RequestMapping("/newMobileVersion")
    public ApiResponse newMobileVersion() {
        return new ApiResponse(new MobileVersion("1.0.1", "1.0.1"));
    }

    @RequestMapping("/someApi/{delayMilli}/{retValue}")
    public ApiResponse someApi(
            @PathVariable Long delayMilli,
            @PathVariable Long retValue) {
        try {
            Thread.sleep(delayMilli);
        } catch (InterruptedException e) {
            throw new ApiException("Interrupted.");
        }

        return new ApiResponse(retValue);
    }

    @ExceptionHandler(ApiException.class)
    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse handleException(ApiException e) {
        return new ApiResponse(500, e.getMessage());
    }
}
