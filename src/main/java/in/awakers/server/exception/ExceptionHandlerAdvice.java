package in.awakers.server.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionHandlerAdvice
{
    @ExceptionHandler({NotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFoundException(NotFoundException notFoundException)
    {
        return notFoundException.getMessage();
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public String handleMethodArgumentNotValidException(
            MethodArgumentNotValidException methodArgumentNotValidException)
    {
        return methodArgumentNotValidException.getBindingResult().getAllErrors().stream()
                                              .map(ObjectError::getDefaultMessage)
                                              .collect(Collectors.joining(", "));
    }
}