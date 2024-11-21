package com.xworkz.mailapp.dto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name="email_details")
public class EmailDto {
    @Id
    @Column(name="email")
    private String email;
}
