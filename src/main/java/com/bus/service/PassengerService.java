package com.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.entity.Passenger;
import com.bus.repository.PassengerRepository;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository repository;
    
    public Passenger savePassenger(Passenger passenger) {
        return repository.save(passenger);
    }

    public List<Passenger> savePassengers(List<Passenger> passengers) {
        return repository.saveAll(passengers);
    }

    public List<Passenger> getPassengers() {
        return repository.findAll();
    }

    public Passenger getPassengerById(int passenger_id) {
        return repository.findById(passenger_id).orElse(null);
    }

    public String deletePassenger(int passenger_id) {
        repository.deleteById(passenger_id);
        return "Passenger (ID: " + passenger_id + ") has been deleted!";
    }

    public Passenger updatePassenger(Passenger passenger) {
        Passenger existingPassenger = repository.findById(passenger.getPassenger_id()).orElse(null);
        existingPassenger.setPassenger_name(passenger.getPassenger_name());
        existingPassenger.setPassenger_phone(passenger.getPassenger_phone());
        existingPassenger.setPassenger_email(passenger.getPassenger_email());
        existingPassenger.setPassenger_password(passenger.getPassenger_password());
        return repository.save(existingPassenger);
    }
}
