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
@Table(name="laptop_details")
public class LaptopDto {
    @Id
    @Column(name = "laptop_id")
    private int laptopId;
    @Column(name = "laptop")
    private String laptop;

}
