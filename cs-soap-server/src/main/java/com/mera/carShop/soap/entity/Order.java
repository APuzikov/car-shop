package com.mera.carShop.soap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    public Order() {
    }

    public Order(long carId, long customerId, String status, String date) {
        this.carId = carId;
        this.customerId = customerId;
        this.status = status;
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(name = "car_id", nullable = false)
    private long carId;

    @Column(name = "customer_id", nullable = false)
    private long customerId;

    @Column(name = "order_status", nullable = false)
    private String status;

    @Column(name = "date", nullable = false)
    private String date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", carId=" + carId +
                ", customerId=" + customerId +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
