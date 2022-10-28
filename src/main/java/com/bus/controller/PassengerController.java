package com.bus.controller;

import com.bus.entity.Passenger;
import com.bus.service.PassengerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PassengerController {
    @Autowired
    private PassengerService service;


    // Add a Passenger
    @PostMapping("/addPassenger")
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return service.savePassenger(passenger);
    }


    // Add multiple Passengers
    @PostMapping("/addPassengers")
    public List<Passenger> addPassengers(@RequestBody List<Passenger> passengers) {
        return service.savePassengers(passengers);
    }


    // Get all Passengers
    @GetMapping("/passengers")
    public List<Passenger> findAllPassengers() {
        return service.getPassengers();
    }


    // Get Passenger by ID
    @GetMapping("/passengerById/{passenger_id}")
    public Passenger findPassengerById(@PathVariable int passenger_id) {
        return service.getPassengerById(passenger_id);
    }


    // Change Passenger Details
    @PutMapping("/update")
    public Passenger updatePassenger(@RequestBody Passenger passenger) {
        return service.updatePassenger(passenger);
    }



    // Delete Passenger by ID
    @DeleteMapping("/delete/{passenger_id}")
    public String deletePassenger(@PathVariable int passenger_id) {
        return service.deletePassenger(passenger_id);
    }

}
