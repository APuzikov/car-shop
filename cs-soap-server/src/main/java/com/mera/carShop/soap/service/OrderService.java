package com.mera.carShop.soap.service;

import com.mera.carShop.soap.model.ByCustomerIdAndStatusRequest;
import com.mera.carShop.soap.model.ByIdRequest;
import com.mera.carShop.soap.model.CreateOrderRequest;
import com.mera.carShop.soap.model.OrderResponse;
import com.mera.carShop.soap.model.UpdateOrderRequest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "OrderService")
public interface OrderService {

    @WebMethod
    @WebResult(name = "createOrder")
    void createOrder(@WebParam(name = "CreateOrderRequest") CreateOrderRequest request);

    @WebMethod
    @WebResult(name = "updateOrder")
    void updateOrder(@WebParam(name = "UpdateOrderRequest") UpdateOrderRequest request);

    @WebMethod
    @WebResult(name = "deleteOrder")
    void deleteOrder(@WebParam(name = "ByIdRequest") ByIdRequest request);

    @WebMethod
    @WebResult(name = "getAllOrders")
    List<OrderResponse> getAllOrders();

    @WebMethod
    @WebResult(name = "getOrderById")
    OrderResponse getOrderById(@WebParam(name = "ByIdRequest") ByIdRequest request);

    @WebMethod
    @WebResult(name = "getOrdersByCustomerIdAndStatus")
    List<OrderResponse> getOrdersByCustomerIdAndStatus(@WebParam(name = "ByCustomerIdAndStatusRequest") ByCustomerIdAndStatusRequest request);
}
