package de.swed.control;

import de.swed.order.Order;
import de.swed.rest.DBConnector;
import de.swed.user.Rating;

import java.util.ArrayList;
import java.util.List;

public class ControlManagement {

    private List<Cost> costs = new ArrayList<>();
    private DBConnector dbConnector;

    public List<Order> getAllOrders() {
        return new ArrayList<>();
    }

    public double getRevenuePerUser(Long userId) {
        return 0L;
    }

    public double calcRevenue() {
        return 0L;
    }

    public List<Rating> collectSuggestions() {
        return new ArrayList<>();
    }

    public List<Cost> getAllCost() {
        return costs;
    }

    public List<Cost> getCostByArt(CostArt costArt) {
        return costs;
    }
}
