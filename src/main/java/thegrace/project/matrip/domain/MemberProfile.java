package thegrace.project.matrip.domain;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class MemberProfile {

    private String email;
    private String nickname;
    private LocalDate birthday;
    private String memberCode;

}
