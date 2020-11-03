package com.example.carserviceapp.CarServiceRestApp.Dao;

import com.example.carserviceapp.CarServiceRestApp.Model.CarModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarRestDao {
    List<CarModel> getRestCarList(String searchCriteria, String key);
}
