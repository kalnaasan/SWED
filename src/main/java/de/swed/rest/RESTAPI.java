package de.swed.rest;

import de.swed.control.ControlManagement;
import de.swed.order.OrderManagement;
import de.swed.user.UserManagement;

import java.util.ArrayList;
import java.util.List;

public class RESTAPI {

    private OrderManagement orderManagement;
    private ControlManagement controlManagement;
    private UserManagement userManagement;

    public <T> List<T> getAll(Class<T> responseClass) {
        return new ArrayList<>();
    }

    public <T> T getByID(Class<T> responseClass, long id) {
        return null;
    }

    public <T> void creat(T object) {
    }

    public <T> T update(T obj) {
        return obj;
    }

    public void delete() {
    }
}
