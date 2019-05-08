package com.mera.carShop.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResponse", propOrder = {
        "id",
        "carId",
        "customerId",
        "status",
        "date"
})
@XmlRootElement(name = "OrderResponse")
public class OrderResponse {

    @XmlElement(name = "Id")
    private Long id;

    @XmlElement(name = "CarId")
    private Long carId;

    @XmlElement(name = "CustomerId")
    private Long customerId;

    @XmlElement(name = "Status")
    private String status;

    @XmlElement(name = "Date")
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
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
}
