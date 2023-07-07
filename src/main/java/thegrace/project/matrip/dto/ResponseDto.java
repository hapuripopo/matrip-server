package thegrace.project.matrip.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

public class ResponseDto {

    @Getter
    @Builder
    public static class PongDto {

        private LocalDateTime timestamp;
        private String message;

    }

    @Getter
    @Builder
    public static class ExceptionDto {

        private LocalDateTime timestamp;
        private String message;

    }

}
