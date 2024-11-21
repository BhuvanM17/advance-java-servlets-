package com.xworkz.travelapp.dto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name="trekking_details")
public class BookingDto {
    @Id
    @Column(name = "trekking_id")
    private int bookingId;
    @Column(name = "email")
    private String email;
}
