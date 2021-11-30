package si.restmongodb.service;

import org.springframework.stereotype.Service;
import si.restmongodb.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders();
    String createOrder(Order order);
    String updateOrder(Order order);
    void deleteOrder(String orderId);
}
