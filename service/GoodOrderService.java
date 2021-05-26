package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.Good;
import ua.lviv.iot.dal.GoodOrderRepository;
import ua.lviv.iot.exceptions.OrderNotFoundException;

import java.util.List;

@Service
@ApplicationScope
public class GoodOrderService {
    @Autowired
    private GoodOrderRepository repository;

    public Good addGood(Good good) {
        return repository.save(good);
    }

    public Good updateGood(Good good) throws  OrderNotFoundException{
        if (repository.existsById(good.getId())){
        return repository.save(good);
        }
        throw new OrderNotFoundException("Order with id:" + good.getId() + " not found");
    }

    public List<Good> getGoods() {
        return repository.findAll();
    }

    public Good getGood(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public String delGood(Integer id){
        repository.deleteById(id);
        return "The element with id: " + id + " was deleted";
    }
}

