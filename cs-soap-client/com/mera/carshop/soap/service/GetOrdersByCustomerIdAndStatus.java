
package com.mera.carshop.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrdersByCustomerIdAndStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrdersByCustomerIdAndStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ByCustomerIdAndStatusRequest" type="{http://service.soap.carShop.mera.com/}ByCustomerIdAndStatusRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrdersByCustomerIdAndStatus", propOrder = {
    "byCustomerIdAndStatusRequest"
})
public class GetOrdersByCustomerIdAndStatus {

    @XmlElement(name = "ByCustomerIdAndStatusRequest")
    protected ByCustomerIdAndStatusRequest byCustomerIdAndStatusRequest;

    /**
     * Gets the value of the byCustomerIdAndStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ByCustomerIdAndStatusRequest }
     *     
     */
    public ByCustomerIdAndStatusRequest getByCustomerIdAndStatusRequest() {
        return byCustomerIdAndStatusRequest;
    }

    /**
     * Sets the value of the byCustomerIdAndStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByCustomerIdAndStatusRequest }
     *     
     */
    public void setByCustomerIdAndStatusRequest(ByCustomerIdAndStatusRequest value) {
        this.byCustomerIdAndStatusRequest = value;
    }

}
