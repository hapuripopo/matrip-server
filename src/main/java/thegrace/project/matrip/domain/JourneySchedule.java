package thegrace.project.matrip.domain;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class JourneySchedule {

    private LocalDate startDate;
    private LocalDate endDate;

}
