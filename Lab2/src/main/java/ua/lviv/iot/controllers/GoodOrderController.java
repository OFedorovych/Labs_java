package ua.lviv.iot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Good;
import ua.lviv.iot.service.GoodOrderService;

import java.util.List;

@RestController
@RequestMapping(path = "/good")
public class GoodOrderController {

    @Autowired
    private GoodOrderService goodOrderService;

    @GetMapping(path = "/{id}")
    public Good getGood(@PathVariable(name = "id") Integer id) {
        return goodOrderService.getGood(id);
    }

    @GetMapping
    public List<Good> getGoods() {
        return goodOrderService.getGoods();
    }


    @PutMapping
    public Good createGood(@RequestBody Good good) {
        return goodOrderService.addGood(good);
    }

    @PostMapping
    public ResponseEntity<Good> updateGood(@RequestBody Good good) {
        if (goodOrderService.getGood(good.getId()) != null) {
            return new ResponseEntity<Good>(goodOrderService.updateGood(good), HttpStatus.OK);
        } else {
            return new ResponseEntity<Good>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping
    public ResponseEntity<Good> deleteGood(@RequestBody Good good) {
        if (goodOrderService.getGood(good.getId()) != null) {
            goodOrderService.delGood(good);
            return new ResponseEntity<Good>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Good>(HttpStatus.NOT_FOUND);
        }
    }
}
