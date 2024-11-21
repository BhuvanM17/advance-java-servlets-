package com.xworkz.tourapp.dto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name="trip_details")
public class RegisterDto {
    @Id
    @Column(name = "trip_id")
    private int registerID;
    @Column(name = "number")
    private long number;

}
