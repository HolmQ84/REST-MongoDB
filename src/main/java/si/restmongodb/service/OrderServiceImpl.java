package si.restmongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import si.restmongodb.entity.Order;
import si.restmongodb.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repo;

    @Override
    public List<Order> getOrders() {
        return this.repo.findAll();
    }

    @Override
    public String createOrder(Order order) {
        return this.repo.save(order).getId();
    }

    @Override
    public String updateOrder(Order order) {
        Optional<Order> updateOrder = this.repo.findById(order.getId());
        if (updateOrder.isPresent()) {
            Order current = updateOrder.get();
            current.setProductId(order.getProductId());
            current.setPrice(order.getPrice());
            current.setUserId(order.getUserId());
            return this.repo.save(current).getId();
        }
        return null;
    }

    @Override
    public void deleteOrder(String orderId) {
        this.repo.deleteById(orderId);
    }
}
