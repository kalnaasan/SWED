package de.swed.order;

import de.swed.user.Person;
import de.swed.user.Address;

import java.util.Date;

public class Order {

    private Long id;
    private Person deliveryPerson;
    private double distance;
    private double price;
    private Date orderDate;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(Person deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void addTracking(Tracking tracking) {
    }

    public void createPaymentDetails() {
    }

    public void updatePaymentDetails(PaymentDetails paymentDetails) {
    }

    private double calcDistance(Address pickupAddress, Address deliveryAddress) {
        return this.distance;
    }

    public double calcPrice() {
        return this.price;
    }
}
