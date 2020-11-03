package com.example.carserviceapp.CarServiceRestApp.Dao;

import com.example.carserviceapp.CarServiceRestApp.Model.CarModel;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarRestDaoImpl implements CarRestDao {

    private static final String CAR_FILE = "src/main/resources/car_info.txt";

    @Override
    public List<CarModel> getRestCarList(String searchCriteria, String key) {
        return readCarFile();
    }

    public List<CarModel> readCarFile() {
        List<CarModel> carList = new ArrayList<>();;
        CarModel car;
        try (BufferedReader br = new BufferedReader(new FileReader(CAR_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                car = new CarModel();
                String[] carArray = line.split(";");
                car.setMarka(carArray[0].toLowerCase());
                car.setModel(carArray[1].toLowerCase());
                car.setSinif(carArray[2].toLowerCase());

                carList.add(car);
            }

            return carList;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
