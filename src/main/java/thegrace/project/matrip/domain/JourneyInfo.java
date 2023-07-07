package thegrace.project.matrip.domain;

import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

@Embeddable
public class JourneyInfo {

    private String title;
    private String content;
    private String openChatRoom;
    private LocalDateTime matched;

}
