package com.xworkz.usnapp.dto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name="usn_details")
public class RegistrationDto {
    @Id
    @Column(name = "usn_id")
    private int usnId;
    @Column(name = "usn")
    private String usn;
}
