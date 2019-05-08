
package com.mera.carshop.soap.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OrderServiceImplService", targetNamespace = "http://service.soap.carShop.mera.com/", wsdlLocation = "http://localhost:8082/services/OrderService?wsdl")
public class OrderServiceImplService
    extends Service
{

    private final static URL ORDERSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORDERSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName ORDERSERVICEIMPLSERVICE_QNAME = new QName("http://service.soap.carShop.mera.com/", "OrderServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/services/OrderService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ORDERSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        ORDERSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public OrderServiceImplService() {
        super(__getWsdlLocation(), ORDERSERVICEIMPLSERVICE_QNAME);
    }

    public OrderServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ORDERSERVICEIMPLSERVICE_QNAME, features);
    }

    public OrderServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, ORDERSERVICEIMPLSERVICE_QNAME);
    }

    public OrderServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ORDERSERVICEIMPLSERVICE_QNAME, features);
    }

    public OrderServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OrderService
     */
    @WebEndpoint(name = "OrderServiceImplPort")
    public OrderService getOrderServiceImplPort() {
        return super.getPort(new QName("http://service.soap.carShop.mera.com/", "OrderServiceImplPort"), OrderService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderService
     */
    @WebEndpoint(name = "OrderServiceImplPort")
    public OrderService getOrderServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.soap.carShop.mera.com/", "OrderServiceImplPort"), OrderService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORDERSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw ORDERSERVICEIMPLSERVICE_EXCEPTION;
        }
        return ORDERSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
