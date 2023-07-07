package thegrace.project.matrip.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

@Entity
public class MemberCredential {

    @Id
    @OneToOne
    private Member member;
    private String password;
    private LocalDate lastUpdated;

}
