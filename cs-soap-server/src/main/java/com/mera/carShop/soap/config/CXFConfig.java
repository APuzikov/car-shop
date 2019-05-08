package com.mera.carShop.soap.config;

import com.mera.carShop.soap.service.OrderServiceImpl;
import com.mera.carShop.soap.service.interceptors.AppInboundInterceptor;
import com.mera.carShop.soap.service.interceptors.AppOutboundInterceptor;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.xml.ws.Endpoint;

@Configuration
@EnableJpaRepositories("com.mera.carShop.soap.repository")
public class CXFConfig {

    private OrderServiceImpl orderServiceImpl;

    @Autowired
    public CXFConfig(OrderServiceImpl orderServiceImpl) {
        this.orderServiceImpl = orderServiceImpl;
    }

    @Bean
    public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/services/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        SpringBus springBus = new SpringBus();
        springBus.getInInterceptors().add(new AppInboundInterceptor());
        springBus.getOutInterceptors().add(new AppOutboundInterceptor());
        return springBus;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), orderServiceImpl);
        endpoint.getFeatures().add(new LoggingFeature());
        endpoint.publish("/OrderService");
        return endpoint;
    }
}
