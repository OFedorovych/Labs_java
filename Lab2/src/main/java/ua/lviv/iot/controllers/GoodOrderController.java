package ua.lviv.iot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.Good;
import ua.lviv.iot.exceptions.OrderNotFoundException;
import ua.lviv.iot.service.GoodOrderService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/good")
public class GoodOrderController {
    private static final Logger LOGGER = Logger.getLogger("ua.lviv.iot.controllers.GoodOrderController");

    @Autowired
    private GoodOrderService goodOrderService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Good> getGood(@PathVariable(name = "id") Integer id) {
        try {
            return new ResponseEntity<Good>(goodOrderService.getGood(id), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            LOGGER.severe("Can't update an order with non-existing id" + id);
            return new ResponseEntity<Good>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<Good> getGoods() {
        return goodOrderService.getGoods();
    }

    @PutMapping
    public ResponseEntity<Good> createGood(@RequestBody Good good) {
        if (good.getId() == null) {
            return new ResponseEntity<Good>(goodOrderService.addGood(good), HttpStatus.OK);
        }
        LOGGER.severe("Failed to create an order with passed id. GoodOrder should not use external ids");
        return new ResponseEntity<Good>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping
    public ResponseEntity<Good> updateGood(@RequestBody Good good) {
        if(good.getId() == null){
            LOGGER.severe("Can't update order without id - null value was passed instead of it");
            return new ResponseEntity<Good>(HttpStatus.BAD_REQUEST);
        }
        try {
            return new ResponseEntity<Good>(goodOrderService.updateGood(good), HttpStatus.OK);
        } catch (OrderNotFoundException e) {
            LOGGER.severe("Can't update an order with non-existing id: " + good.getId());
            return new ResponseEntity<Good>(HttpStatus.NOT_FOUND);
        }
    }
}
