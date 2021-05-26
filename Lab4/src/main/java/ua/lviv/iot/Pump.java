package ua.lviv.iot;

import lombok.*;


@Data

public class Pump extends Good {

    public int maxPressure;
    public String nippelType;

    public Pump(Integer id, double price, int weightInGrams, String producer, Country country, int maxPressure, String nippelType) {
        super(id, price, weightInGrams, producer, country);
        this.maxPressure = maxPressure;
        this.nippelType = nippelType;
        System.out.println(">>>>>>>>>>>" + super.toString());

    }

    @Override
    public String toString() {
        return "ua.lviv.iot.Pump{" +
                "producer='" + getProducer() + '\'' +
                ", country='" + country + '\'' +
                ", price=" + getPrice() +
                ", weightInGrams=" + getWeightInGrams() +
                ", maxPressure=" + maxPressure +
                ", nippelType='" + nippelType + '\'' +
                '}';
    }
}