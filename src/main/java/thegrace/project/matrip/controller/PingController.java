package thegrace.project.matrip.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import thegrace.project.matrip.dto.ResponseDto;

import java.time.LocalDateTime;

@RestController
public class PingController {

    @GetMapping("/ping")
    public ResponseEntity<ResponseDto.PongDto> ping() {
        return ResponseEntity.ok(
                ResponseDto.PongDto.builder()
                        .timestamp(LocalDateTime.now())
                        .message("pong")
                        .build()
        );
    }

}
