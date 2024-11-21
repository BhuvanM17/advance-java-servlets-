package com.xworkz.luckydipapp.dto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name="lucky_dip_details")
public class RegisterDto {
    @Id
    @Column(name = "lucky_dip_id")
    private int registerId;
    @Column(name = "phone")
    private long phone;
}
