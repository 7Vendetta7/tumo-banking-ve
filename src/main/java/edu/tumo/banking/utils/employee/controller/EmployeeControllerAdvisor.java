package edu.tumo.banking.utils.employee.controller;

import com.mysql.cj.xdevapi.JsonArray;
import com.mysql.cj.xdevapi.JsonString;
import com.mysql.cj.xdevapi.JsonValue;
import edu.tumo.banking.utils.customexceptions.address.AddressNotFoundException;
import edu.tumo.banking.utils.customexceptions.address.InvalidAddressException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class EmployeeControllerAdvisor extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDate.now());
        body.put("status", 400);
        JsonArray array = new JsonArray();
        array.addAll(ex.getAllErrors().stream()
                .map(item -> new JsonString().setValue(String.valueOf(item.getDefaultMessage())))
                .collect(Collectors.toList()));
        List<String> errors = new ArrayList<>();
        array.forEach(jsonValue -> errors.add(((JsonString) jsonValue).getString()));
        body.put("errors", errors);
        return ResponseEntity.badRequest().body(body);
    }

    @ExceptionHandler(AddressNotFoundException.class)
    public ResponseEntity<Object> handleAddressNotFoundException(AddressNotFoundException exception,
                                                                 WebRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", HttpStatus.NOT_FOUND.value());
        body.put("error", HttpStatus.NOT_FOUND.getReasonPhrase());
        body.put("message", exception.getMessage());
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidAddressException.class)
    public ResponseEntity<Object> handleInvalidAddressException(InvalidAddressException exception) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDate.now());
        body.put("status", 400);
        JsonArray array = new JsonArray();
        array.addAll(exception.getErrors().stream()
                .map(item -> new JsonString().setValue(item))
                .collect(Collectors.toList()));
        body.put("errors", array);
        return ResponseEntity.badRequest().body(body);
    }

    private List<JsonValue> convertStringArrayToJSONArray(List<String> errors) {
        return errors.stream()
                .map(item -> new JsonString().setValue(item))
                .collect(Collectors.toList());
    }
}
