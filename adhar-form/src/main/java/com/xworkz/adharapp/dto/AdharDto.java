package com.xworkz.adharapp.dto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name="adhar_details")
public class AdharDto {
    @Id
    @Column(name="adhar_id")
    private int adharId;
    @Column(name="adhar_number")
    private long adharNumber;
}
