package ua.lviv.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.controllers", "ua.lviv.iot.service"})
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

//        GoodManager myGoods = new GoodManager();
//        myGoods.addGood(new Pump(88, 159.9, 300, "Green Cycle", Country.France, 60, "Type K"));
//        myGoods.addGood(new Multitool(65, 185, 400, "Blan Bike", Country.Canada, 90, 5));
//        myGoods.addGood(new Lamp(12, 114.9, 750, "American Bicycle Group", Country.USA, 50, 5000, 6));
//
//        System.out.println("Goods made by Blan Bike:");
//        System.out.println(myGoods.findByProducer("Blan Bike"));
//
//        myGoods.sortByPrice(true);
//
//        System.out.println("Goods sorted by price:");
//        myGoods.printAll();
//
//        myGoods.sortByProducer(true);
//        System.out.println("Goods sorted by producer:");
//        myGoods.printAll();
    }
}
