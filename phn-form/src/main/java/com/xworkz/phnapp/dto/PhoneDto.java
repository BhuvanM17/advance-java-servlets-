package com.xworkz.phnapp.dto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name="phone_details")
public class PhoneDto {
    @Id
    @Column(name="phone_id")
    private int phoneId;
    @Column(name="phone")
    private long phone;
}
