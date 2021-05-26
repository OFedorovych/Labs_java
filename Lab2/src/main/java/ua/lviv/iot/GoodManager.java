package ua.lviv.iot;

import lombok.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

@Data

public class GoodManager {

    private List<Good> goods = new ArrayList<>();

    public final void addGood(Good newGood) {
        this.goods.add(newGood);
    }

   public List<Good> findByProducer(String wantedProducer){
        return goods.stream()
                .filter(pump -> pump.getProducer().equals(wantedProducer))
                .collect(Collectors.toList());
    };

   public List<Good> sortByPrice(boolean sortAscending){
       if(sortAscending){
           goods.sort(Comparator.comparing(Good::getPrice));
       }
       else{
           goods.sort(Comparator.comparing(Good::getPrice).reversed());
       }
       return goods;
   };

    public List<Good> sortByProducer(boolean sortAscending) {
        if (sortAscending) {
            goods.sort(Comparator.comparing(Good::getProducer));
        }
        else{
            goods.sort(Comparator.comparing(Good::getProducer).reversed());
        }
        return goods;
    };

   public void printAll(){
       for (Good good:goods){
           System.out.println(good);
       }


   }



}