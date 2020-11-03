package com.example.carserviceapp.CarServiceRestApp.Model;

public class CarModel {
    private String marka;
    private String model;
    private String sinif;

    public CarModel() {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
