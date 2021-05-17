package ua.lviv.iot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.Good;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
@ApplicationScope
public class GoodOrderService {

    private final AtomicInteger id = new AtomicInteger(0);

    private final Map<Integer, Good> goodsMap = new HashMap<Integer, Good>();

    public Good addGood(Good good) {
        Integer goodId = id.incrementAndGet();
        good.setId(goodId);
        goodsMap.put(goodId, good);
        return good;
    }

    public Good updateGood(Good good) {
        return goodsMap.put(good.getId(), good);

    }

    public List<Good> getGoods() {
        return goodsMap.values().stream().collect(Collectors.toList());
    }

    public Good getGood(Integer id) {
        return goodsMap.get(id);
    }

    public List<Good> delGood(Good good){
        goodsMap.remove(good.getId(), good);
        return goodsMap.values().stream().collect(Collectors.toList());
    }
}

