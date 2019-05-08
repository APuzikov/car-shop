
package com.mera.carshop.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mera.carshop.soap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllOrders_QNAME = new QName("http://service.soap.carShop.mera.com/", "getAllOrders");
    private final static QName _OrderResponse_QNAME = new QName("http://service.soap.carShop.mera.com/", "OrderResponse");
    private final static QName _UpdateOrder_QNAME = new QName("http://service.soap.carShop.mera.com/", "updateOrder");
    private final static QName _GetOrderByIdResponse_QNAME = new QName("http://service.soap.carShop.mera.com/", "getOrderByIdResponse");
    private final static QName _GetAllOrdersResponse_QNAME = new QName("http://service.soap.carShop.mera.com/", "getAllOrdersResponse");
    private final static QName _ByCustomerIdAndStatusRequest_QNAME = new QName("http://service.soap.carShop.mera.com/", "ByCustomerIdAndStatusRequest");
    private final static QName _CreateOrderRequest_QNAME = new QName("http://service.soap.carShop.mera.com/", "CreateOrderRequest");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://service.soap.carShop.mera.com/", "createOrderResponse");
    private final static QName _UpdateOrderResponse_QNAME = new QName("http://service.soap.carShop.mera.com/", "updateOrderResponse");
    private final static QName _GetOrderById_QNAME = new QName("http://service.soap.carShop.mera.com/", "getOrderById");
    private final static QName _CreateOrder_QNAME = new QName("http://service.soap.carShop.mera.com/", "createOrder");
    private final static QName _DeleteOrderResponse_QNAME = new QName("http://service.soap.carShop.mera.com/", "deleteOrderResponse");
    private final static QName _UpdateOrderRequest_QNAME = new QName("http://service.soap.carShop.mera.com/", "UpdateOrderRequest");
    private final static QName _DeleteOrder_QNAME = new QName("http://service.soap.carShop.mera.com/", "deleteOrder");
    private final static QName _GetOrdersByCustomerIdAndStatus_QNAME = new QName("http://service.soap.carShop.mera.com/", "getOrdersByCustomerIdAndStatus");
    private final static QName _GetOrdersByCustomerIdAndStatusResponse_QNAME = new QName("http://service.soap.carShop.mera.com/", "getOrdersByCustomerIdAndStatusResponse");
    private final static QName _ByIdRequest_QNAME = new QName("http://service.soap.carShop.mera.com/", "ByIdRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mera.carshop.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link DeleteOrderResponse }
     * 
     */
    public DeleteOrderResponse createDeleteOrderResponse() {
        return new DeleteOrderResponse();
    }

    /**
     * Create an instance of {@link GetOrderById }
     * 
     */
    public GetOrderById createGetOrderById() {
        return new GetOrderById();
    }

    /**
     * Create an instance of {@link UpdateOrderResponse }
     * 
     */
    public UpdateOrderResponse createUpdateOrderResponse() {
        return new UpdateOrderResponse();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link ByCustomerIdAndStatusRequest }
     * 
     */
    public ByCustomerIdAndStatusRequest createByCustomerIdAndStatusRequest() {
        return new ByCustomerIdAndStatusRequest();
    }

    /**
     * Create an instance of {@link CreateOrderRequest }
     * 
     */
    public CreateOrderRequest createCreateOrderRequest() {
        return new CreateOrderRequest();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link GetOrderByIdResponse }
     * 
     */
    public GetOrderByIdResponse createGetOrderByIdResponse() {
        return new GetOrderByIdResponse();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link UpdateOrder }
     * 
     */
    public UpdateOrder createUpdateOrder() {
        return new UpdateOrder();
    }

    /**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link ByIdRequest }
     * 
     */
    public ByIdRequest createByIdRequest() {
        return new ByIdRequest();
    }

    /**
     * Create an instance of {@link GetOrdersByCustomerIdAndStatusResponse }
     * 
     */
    public GetOrdersByCustomerIdAndStatusResponse createGetOrdersByCustomerIdAndStatusResponse() {
        return new GetOrdersByCustomerIdAndStatusResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByCustomerIdAndStatus }
     * 
     */
    public GetOrdersByCustomerIdAndStatus createGetOrdersByCustomerIdAndStatus() {
        return new GetOrdersByCustomerIdAndStatus();
    }

    /**
     * Create an instance of {@link DeleteOrder }
     * 
     */
    public DeleteOrder createDeleteOrder() {
        return new DeleteOrder();
    }

    /**
     * Create an instance of {@link UpdateOrderRequest }
     * 
     */
    public UpdateOrderRequest createUpdateOrderRequest() {
        return new UpdateOrderRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "getAllOrders")
    public JAXBElement<GetAllOrders> createGetAllOrders(GetAllOrders value) {
        return new JAXBElement<GetAllOrders>(_GetAllOrders_QNAME, GetAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "OrderResponse")
    public JAXBElement<OrderResponse> createOrderResponse(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponse_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "updateOrder")
    public JAXBElement<UpdateOrder> createUpdateOrder(UpdateOrder value) {
        return new JAXBElement<UpdateOrder>(_UpdateOrder_QNAME, UpdateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "getOrderByIdResponse")
    public JAXBElement<GetOrderByIdResponse> createGetOrderByIdResponse(GetOrderByIdResponse value) {
        return new JAXBElement<GetOrderByIdResponse>(_GetOrderByIdResponse_QNAME, GetOrderByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "getAllOrdersResponse")
    public JAXBElement<GetAllOrdersResponse> createGetAllOrdersResponse(GetAllOrdersResponse value) {
        return new JAXBElement<GetAllOrdersResponse>(_GetAllOrdersResponse_QNAME, GetAllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByCustomerIdAndStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "ByCustomerIdAndStatusRequest")
    public JAXBElement<ByCustomerIdAndStatusRequest> createByCustomerIdAndStatusRequest(ByCustomerIdAndStatusRequest value) {
        return new JAXBElement<ByCustomerIdAndStatusRequest>(_ByCustomerIdAndStatusRequest_QNAME, ByCustomerIdAndStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "CreateOrderRequest")
    public JAXBElement<CreateOrderRequest> createCreateOrderRequest(CreateOrderRequest value) {
        return new JAXBElement<CreateOrderRequest>(_CreateOrderRequest_QNAME, CreateOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "createOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "updateOrderResponse")
    public JAXBElement<UpdateOrderResponse> createUpdateOrderResponse(UpdateOrderResponse value) {
        return new JAXBElement<UpdateOrderResponse>(_UpdateOrderResponse_QNAME, UpdateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "getOrderById")
    public JAXBElement<GetOrderById> createGetOrderById(GetOrderById value) {
        return new JAXBElement<GetOrderById>(_GetOrderById_QNAME, GetOrderById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "createOrder")
    public JAXBElement<CreateOrder> createCreateOrder(CreateOrder value) {
        return new JAXBElement<CreateOrder>(_CreateOrder_QNAME, CreateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "deleteOrderResponse")
    public JAXBElement<DeleteOrderResponse> createDeleteOrderResponse(DeleteOrderResponse value) {
        return new JAXBElement<DeleteOrderResponse>(_DeleteOrderResponse_QNAME, DeleteOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "UpdateOrderRequest")
    public JAXBElement<UpdateOrderRequest> createUpdateOrderRequest(UpdateOrderRequest value) {
        return new JAXBElement<UpdateOrderRequest>(_UpdateOrderRequest_QNAME, UpdateOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "deleteOrder")
    public JAXBElement<DeleteOrder> createDeleteOrder(DeleteOrder value) {
        return new JAXBElement<DeleteOrder>(_DeleteOrder_QNAME, DeleteOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByCustomerIdAndStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "getOrdersByCustomerIdAndStatus")
    public JAXBElement<GetOrdersByCustomerIdAndStatus> createGetOrdersByCustomerIdAndStatus(GetOrdersByCustomerIdAndStatus value) {
        return new JAXBElement<GetOrdersByCustomerIdAndStatus>(_GetOrdersByCustomerIdAndStatus_QNAME, GetOrdersByCustomerIdAndStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByCustomerIdAndStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "getOrdersByCustomerIdAndStatusResponse")
    public JAXBElement<GetOrdersByCustomerIdAndStatusResponse> createGetOrdersByCustomerIdAndStatusResponse(GetOrdersByCustomerIdAndStatusResponse value) {
        return new JAXBElement<GetOrdersByCustomerIdAndStatusResponse>(_GetOrdersByCustomerIdAndStatusResponse_QNAME, GetOrdersByCustomerIdAndStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carShop.mera.com/", name = "ByIdRequest")
    public JAXBElement<ByIdRequest> createByIdRequest(ByIdRequest value) {
        return new JAXBElement<ByIdRequest>(_ByIdRequest_QNAME, ByIdRequest.class, null, value);
    }

}
