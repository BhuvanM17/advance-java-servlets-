package com.xworkz.registerapp.dto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
    @Table(name="xworkz_details")
public class RegisterDto {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
}
