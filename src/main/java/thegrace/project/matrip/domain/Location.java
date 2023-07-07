package thegrace.project.matrip.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Location {

    @Id
    @OneToOne
    private Journey journey;
    private String nation;
    private String region;
    private String street;
    private String details;

}
