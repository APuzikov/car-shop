
package com.mera.carshop.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateOrderRequest" type="{http://service.soap.carShop.mera.com/}UpdateOrderRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateOrder", propOrder = {
    "updateOrderRequest"
})
public class UpdateOrder {

    @XmlElement(name = "UpdateOrderRequest")
    protected UpdateOrderRequest updateOrderRequest;

    /**
     * Gets the value of the updateOrderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderRequest }
     *     
     */
    public UpdateOrderRequest getUpdateOrderRequest() {
        return updateOrderRequest;
    }

    /**
     * Sets the value of the updateOrderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderRequest }
     *     
     */
    public void setUpdateOrderRequest(UpdateOrderRequest value) {
        this.updateOrderRequest = value;
    }

}
