package de.swed.order;

import de.swed.rest.DBConnector;
import de.swed.user.User;

import java.util.ArrayList;
import java.util.List;

public class OrderManagement {

    private List<Order> orders = new ArrayList<>();
    private DBConnector dbConnector;

    public void placeOrder(User recipient) {
    }

    public void updateOrder(Order order) {
    }

    public String cancelOrder(Order order) {
        return "cancellation";
    }

    public String notifyContractor() {
        return "notification";
    }

    public String sendStatus() {
        return "status";
    }

    private void deleteRecipient() {
    }

    private void sendRatingEmail() {
    }
}
