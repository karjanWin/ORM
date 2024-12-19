package com.project.ordermanagement;

public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        service.addOrder(new Order(1, "Laptop", "Pending"));
        service.addOrder(new Order(2, "Mobile", "Shipped"));

        service.getAllOrders().forEach(order ->
                System.out.println("Order ID: " + order.getId() + ", Status: " + order.getStatus())
        );

        service.updateOrderStatus(1, "Delivered");
        System.out.println("Order 1 updated.");
    }
}
