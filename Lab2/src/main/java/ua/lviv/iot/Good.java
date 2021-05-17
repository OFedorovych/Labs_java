package ua.lviv.iot;

import lombok.*;



@Data
@NoArgsConstructor
public class Good {
	
	private Integer id;

	@NonNull
    private double price;

    @NonNull
    private int weightInGrams;

    @NonNull
    private String producer;

    public Country country;

    public Good(Integer id, double price, int weightInGrams, String producer, Country country) {
        this.id = id;
        this.price = price;
        this.weightInGrams = weightInGrams;
        this.producer = producer;
        this.country = country;
    }


    @Override
    public String toString() {
        return "Good {" +
                "producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                ", price=" + getPrice() +
                ", weightInGrams=" + getWeightInGrams() +
                ", producer=" + getProducer() +
        '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
}
