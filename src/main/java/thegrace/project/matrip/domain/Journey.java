package thegrace.project.matrip.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import thegrace.project.matrip.util.BaseEntity;

@Entity
public class Journey extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Team hostTeamId;
    @Embedded
    private JourneySchedule journeySchedule;
    @Embedded
    private JourneyInfo journeyInfo;

}
