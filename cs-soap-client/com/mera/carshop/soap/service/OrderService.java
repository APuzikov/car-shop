
package com.mera.carshop.soap.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrderService", targetNamespace = "http://service.soap.carShop.mera.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderService {


    /**
     * 
     * @return
     *     returns java.util.List<com.mera.carshop.soap.service.OrderResponse>
     */
    @WebMethod
    @WebResult(name = "getAllOrders", targetNamespace = "")
    @RequestWrapper(localName = "getAllOrders", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.GetAllOrders")
    @ResponseWrapper(localName = "getAllOrdersResponse", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.GetAllOrdersResponse")
    public List<OrderResponse> getAllOrders();

    /**
     * 
     * @param byIdRequest
     */
    @WebMethod
    @RequestWrapper(localName = "deleteOrder", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.DeleteOrder")
    @ResponseWrapper(localName = "deleteOrderResponse", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.DeleteOrderResponse")
    public void deleteOrder(
        @WebParam(name = "ByIdRequest", targetNamespace = "")
        ByIdRequest byIdRequest);

    /**
     * 
     * @param updateOrderRequest
     */
    @WebMethod
    @RequestWrapper(localName = "updateOrder", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.UpdateOrder")
    @ResponseWrapper(localName = "updateOrderResponse", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.UpdateOrderResponse")
    public void updateOrder(
        @WebParam(name = "UpdateOrderRequest", targetNamespace = "")
        UpdateOrderRequest updateOrderRequest);

    /**
     * 
     * @param byCustomerIdAndStatusRequest
     * @return
     *     returns java.util.List<com.mera.carshop.soap.service.OrderResponse>
     */
    @WebMethod
    @WebResult(name = "getOrdersByCustomerIdAndStatus", targetNamespace = "")
    @RequestWrapper(localName = "getOrdersByCustomerIdAndStatus", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.GetOrdersByCustomerIdAndStatus")
    @ResponseWrapper(localName = "getOrdersByCustomerIdAndStatusResponse", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.GetOrdersByCustomerIdAndStatusResponse")
    public List<OrderResponse> getOrdersByCustomerIdAndStatus(
        @WebParam(name = "ByCustomerIdAndStatusRequest", targetNamespace = "")
        ByCustomerIdAndStatusRequest byCustomerIdAndStatusRequest);

    /**
     * 
     * @param byIdRequest
     * @return
     *     returns com.mera.carshop.soap.service.OrderResponse
     */
    @WebMethod
    @WebResult(name = "getOrderById", targetNamespace = "")
    @RequestWrapper(localName = "getOrderById", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.GetOrderById")
    @ResponseWrapper(localName = "getOrderByIdResponse", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.GetOrderByIdResponse")
    public OrderResponse getOrderById(
        @WebParam(name = "ByIdRequest", targetNamespace = "")
        ByIdRequest byIdRequest);

    /**
     * 
     * @param createOrderRequest
     */
    @WebMethod
    @RequestWrapper(localName = "createOrder", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.CreateOrder")
    @ResponseWrapper(localName = "createOrderResponse", targetNamespace = "http://service.soap.carShop.mera.com/", className = "com.mera.carshop.soap.service.CreateOrderResponse")
    public void createOrder(
        @WebParam(name = "CreateOrderRequest", targetNamespace = "")
        CreateOrderRequest createOrderRequest);

}
