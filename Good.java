package ua.lviv.iot;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private double price;

    @NonNull
    private int weightInGrams;

    @NonNull
    private String producer;

    public Country country;

//    public Good(Integer id, double price, int weightInGrams, String producer, Country country) {
//        this.id = id;
//        this.price = price;
//        this.weightInGrams = weightInGrams;
//        this.producer = producer;
//        this.country = country;
//    }

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
}
