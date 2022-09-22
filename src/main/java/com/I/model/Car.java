package com.I.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table (name = "Car")

public class Car {




    @Id
    @GeneratedValue
    private int id;

    private  String make;
    @Column (nullable = false)
    private  String brand;
    @Column (nullable = false)
    private int probeg ;


}
