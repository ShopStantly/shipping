package com.webshop.WebShopstantly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OrderService {

    @Autowired
    private ShippingRepository orderRepository;

    public Boolean getStatus() {
        List<Order1> orders = orderRepository.findAll();
        Order1 order = orders.isEmpty() ? new Order1() : orders.get(0);
        return order.getStatus();
    }

    public Order1 getOrder() {
        List<Order1> orders = orderRepository.findAll();
        return orders.isEmpty() ? new Order1() : orders.get(0);
    }

    public void saveOrder() {
        Order1 order = new Order1();
        //status set to false (false = not shipped yet)
        order.setStatus(false);

        //generates random id value
        Random rand = new Random();
        Integer id = rand.nextInt();
        order.setId(id.toString());

        orderRepository.save(order);

    }

}
