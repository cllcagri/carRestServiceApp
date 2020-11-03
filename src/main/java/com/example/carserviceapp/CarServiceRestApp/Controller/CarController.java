package com.example.carserviceapp.CarServiceRestApp.Controller;

import com.example.carserviceapp.CarServiceRestApp.Model.CarModel;
import com.example.carserviceapp.CarServiceRestApp.Service.CarRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarRestService carRestService;


    @RequestMapping("/searchRest")
    public List<CarModel> getRestCarList(@RequestParam(value = "searchCriteria") String searchCriteria, @RequestParam(value = "key") String key){
        return carRestService.getRestCarList(searchCriteria.toLowerCase(),key.toLowerCase());
    }

}
