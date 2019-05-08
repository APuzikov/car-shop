package com.mera.carShop.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByCustomerIdAndStatusRequest", propOrder = {
        "customerId",
        "status"
})
@XmlRootElement(name = "ByCustomerIdAndStatusRequest")
public class ByCustomerIdAndStatusRequest {

    @XmlElement
    private Long customerId;

    @XmlElement
    private String status;

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
}
