package ua.lviv.iot;

import lombok.*;

@Data

public class Multitool extends Good{

    public int sizeInMm;
    public int numberOfTools;

    public Multitool(Integer id, double price, int weightInGrams, String producer, Country country, int sizeInMm, int numberOfTools) {
        super(id, price, weightInGrams, producer, country);
        this.sizeInMm = sizeInMm;
        this.numberOfTools = numberOfTools;
    }

    @Override
    public String toString() {
        return "ua.lviv.iot.Multitool{" +
                "producer='" + getProducer() + '\'' +
                ", country='" + country + '\'' +
                ", price=" + getPrice() +
                ", weightInGrams=" + getWeightInGrams() +
                ", sizeInMm=" + sizeInMm +
                ", numberOfTools=" + numberOfTools +
                '}';
    }
}
