
package com.mera.carshop.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrderById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrderById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ByIdRequest" type="{http://service.soap.carShop.mera.com/}ByIdRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderById", propOrder = {
    "byIdRequest"
})
public class GetOrderById {

    @XmlElement(name = "ByIdRequest")
    protected ByIdRequest byIdRequest;

    /**
     * Gets the value of the byIdRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ByIdRequest }
     *     
     */
    public ByIdRequest getByIdRequest() {
        return byIdRequest;
    }

    /**
     * Sets the value of the byIdRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByIdRequest }
     *     
     */
    public void setByIdRequest(ByIdRequest value) {
        this.byIdRequest = value;
    }

}
