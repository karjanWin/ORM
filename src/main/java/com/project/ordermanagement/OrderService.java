package com.project.ordermanagement;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public boolean updateOrderStatus(int id, String newStatus) {
        for (Order order : orders) {
            if (order.getId() == id) {
                order.setStatus(newStatus);
                return true;
            }
        }
        return false;
    }
}
