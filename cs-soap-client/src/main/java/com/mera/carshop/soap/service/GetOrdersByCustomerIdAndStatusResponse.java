
package com.mera.carshop.soap.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrdersByCustomerIdAndStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrdersByCustomerIdAndStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getOrdersByCustomerIdAndStatus" type="{http://service.soap.carShop.mera.com/}OrderResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrdersByCustomerIdAndStatusResponse", propOrder = {
    "getOrdersByCustomerIdAndStatus"
})
public class GetOrdersByCustomerIdAndStatusResponse {

    protected List<OrderResponse> getOrdersByCustomerIdAndStatus;

    /**
     * Gets the value of the getOrdersByCustomerIdAndStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getOrdersByCustomerIdAndStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetOrdersByCustomerIdAndStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderResponse }
     * 
     * 
     */
    public List<OrderResponse> getGetOrdersByCustomerIdAndStatus() {
        if (getOrdersByCustomerIdAndStatus == null) {
            getOrdersByCustomerIdAndStatus = new ArrayList<OrderResponse>();
        }
        return this.getOrdersByCustomerIdAndStatus;
    }

}
