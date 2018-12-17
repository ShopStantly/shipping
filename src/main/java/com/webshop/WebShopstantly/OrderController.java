package com.webshop.WebShopstantly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(path = "status", method = RequestMethod.GET)
    public Boolean checkStatusForOrder() {
        return orderService.getStatus();
    }

    @RequestMapping(path = "order", method = RequestMethod.GET)
    public Order1 getOrder() {
        return orderService.getOrder();
    }

    @RequestMapping(path = "saveorder", method = RequestMethod.GET)
    public String asd() {
        orderService.saveOrder();
        System.err.println("Order is being delivered by DHL");
        return "order saved";
    }

}
