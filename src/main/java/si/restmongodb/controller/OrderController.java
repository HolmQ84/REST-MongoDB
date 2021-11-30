package si.restmongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import si.restmongodb.entity.Order;
import si.restmongodb.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return this.orderService.getOrders();
    }

    @PostMapping("/createOrder")
    public String createOrder(@RequestBody Order order) {
        return this.orderService.createOrder(order);
    }

    @PutMapping("/updateOrder")
    public String updateOrder(@RequestBody Order order) {
        return this.orderService.updateOrder(order);
    }

    @DeleteMapping("/deleteOrder/{id}")
    public String deleteOrder(@PathVariable String id) {
        this.orderService.deleteOrder(id);
        return "200 - OK";
    }
}
