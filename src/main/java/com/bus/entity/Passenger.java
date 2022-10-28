package com.bus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PASSENGER")
public class Passenger {

    @Id
    @GeneratedValue
    private int passenger_id;
    private String passenger_name;
    private String passenger_phone;
    private String passenger_email;
    private String passenger_password;

}
