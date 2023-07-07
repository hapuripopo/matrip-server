package thegrace.project.matrip.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import thegrace.project.matrip.util.BaseEntity;

import java.time.LocalDateTime;

@Entity
public class JoinRequest extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Team team;
    @ManyToOne
    private Journey journey;
    private LocalDateTime matchedAt;
    private LocalDateTime rejectedAt;

}
