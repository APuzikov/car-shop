package com.mera.client.data;

public class Order {

    private long id;
    private long carId;
    private long customerId;
    private String status;
    private String date;

    public Order() {
    }

    public Order(long carId, long customerId) {
        this.carId = carId;
        this.customerId = customerId;
    }

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

