package ua.lviv.iot;

import lombok.*;

@Data

public class Lamp extends Good{

    public int numberOfLEDs;
    public int colorTemperatureInK;
    public float workTimeInHours;

    public Lamp(Integer id, double price, int weightInGrams, String producer, Country country, int numberOfLEDs, int colorTemperatureInK, float workTimeInHours) {
        super(id, price, weightInGrams, producer, country);
        this.numberOfLEDs = numberOfLEDs;
        this.colorTemperatureInK = colorTemperatureInK;
        this.workTimeInHours = workTimeInHours;
    }

    @Override
    public String toString() {
        return "ua.lviv.iot.Lamp{" +
                "producer='" + getProducer() + '\'' +
                ", country='" + country + '\'' +
                ", price=" + getPrice() +
                ", weightInGrams=" + getWeightInGrams() +
                ", numberOfLEDs=" + numberOfLEDs +
                ", colorTemperatureInK=" + colorTemperatureInK +
                ", workTimeInHours=" + workTimeInHours +
                '}';
    }
}
