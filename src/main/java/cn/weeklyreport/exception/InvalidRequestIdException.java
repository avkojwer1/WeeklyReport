package cn.weeklyreport.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by greg.chen on 14-10-6.
 */
public class InvalidRequestIdException extends RuntimeException{
    public InvalidRequestIdException(String message) {
        super(message);
    }
}
