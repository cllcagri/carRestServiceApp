package com.example.carserviceapp.CarServiceRestApp.Service;

import com.example.carserviceapp.CarServiceRestApp.Dao.CarRestDao;
import com.example.carserviceapp.CarServiceRestApp.Model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarRestServiceImpl implements CarRestService {

    @Autowired
    CarRestDao carRestDao;

    public static final String MARKA = "marka";
    public static final String MODEL = "model";
    public static final String SINIF = "sinif";
    public static final String HEPSI = "hepsi";

    @Override
    public List<CarModel> getRestCarList(String searchCriteria, String key) {
        List<CarModel> carModels = carRestDao.getRestCarList(searchCriteria, key);
        return getSearchedList(carModels, searchCriteria, key);
    }


    public List<CarModel> getSearchedList(List<CarModel> carList, String searchCriteria, String key) {
        List<CarModel> carModelList = new ArrayList<>();
        if (searchCriteria.equals(MARKA) || searchCriteria.equals(MODEL) ||
                searchCriteria.equals(SINIF) || searchCriteria.equals(HEPSI)) {

            carList.forEach(car -> {
                if (searchCriteria.equals(MARKA) && car.getMarka().contains(key)) {
                    carModelList.add(car);
                } else if (searchCriteria.equals(MODEL) && car.getModel().contains(key)) {
                    carModelList.add(car);
                } else if (searchCriteria.equals(SINIF) && car.getSinif().contains(key)) {
                    carModelList.add(car);
                } else if (searchCriteria.equals(HEPSI) &&
                        (car.getModel().contains(key) || car.getMarka().contains(key) || car.getSinif().contains(key))) {
                    carModelList.add(car);
                }
            });

        }


        return carModelList;
    }
}
