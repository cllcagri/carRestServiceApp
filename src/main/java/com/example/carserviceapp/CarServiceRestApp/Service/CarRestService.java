package com.example.carserviceapp.CarServiceRestApp.Service;


import com.example.carserviceapp.CarServiceRestApp.Model.CarModel;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface CarRestService {
     List<CarModel> getRestCarList(String searchCriteria, String key);
}
