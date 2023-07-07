package thegrace.project.matrip.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import thegrace.project.matrip.dto.ResponseDto;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseDto.ExceptionDto> customExceptionHandler(CustomException exception) {
        return ResponseEntity
                .badRequest()
                .body(
                        ResponseDto.ExceptionDto.builder()
                                .timestamp(LocalDateTime.now())
                                .message(exception.getMessage())
                                .build()
                );
    }

}
