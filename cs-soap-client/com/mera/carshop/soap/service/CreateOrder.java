
package com.mera.carshop.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateOrderRequest" type="{http://service.soap.carShop.mera.com/}CreateOrderRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrder", propOrder = {
    "createOrderRequest"
})
public class CreateOrder {

    @XmlElement(name = "CreateOrderRequest")
    protected CreateOrderRequest createOrderRequest;

    /**
     * Gets the value of the createOrderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrderRequest }
     *     
     */
    public CreateOrderRequest getCreateOrderRequest() {
        return createOrderRequest;
    }

    /**
     * Sets the value of the createOrderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrderRequest }
     *     
     */
    public void setCreateOrderRequest(CreateOrderRequest value) {
        this.createOrderRequest = value;
    }

}
