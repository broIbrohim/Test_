package com.I.service;


import com.I.model.Car;
import com.I.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired private CarRepository carRepository ;


    public List<Car> carList () {
        return (List<Car>) carRepository.findAll();
    }

    public void  Save (Car car ) {

        carRepository.save(car);
    }

    public void  Delete (int id ) {
        carRepository.deleteById(id);
    }

    public Car editById (int id ) {
        Optional<Car> byId = carRepository.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }else return null;

    }
}
