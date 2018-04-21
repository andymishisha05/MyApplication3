package com.ebn.essam.myapplication;

public class ApartmentModel {
    public Double  lat  ;
    public Double lng  ;
    public  String  size  ;
    public  String desc ;

    public  String adress ;

    public ApartmentModel() {
    }

    public ApartmentModel(Double lat, Double lng, String size, String desc, String adress) {
        this.lat = lat;
        this.lng = lng;
        this.size = size;
        this.desc = desc;
        this.adress = adress;
    }
}
