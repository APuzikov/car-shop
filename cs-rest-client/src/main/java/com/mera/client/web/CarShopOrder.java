package com.mera.client.web;

import com.mera.client.data.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

@Component
public class CarShopOrder {

    private static final Logger logger = LogManager.getLogger(CarShopOrder.class);

    private final WebClient webClient;

    public CarShopOrder(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080/api").build();
    }

    public List<Order> getAllOrders() {
        List<Order> orders = webClient.get().uri("/orders").retrieve().bodyToFlux(Order.class).collectList().block();
        assert orders != null;
        logger.info("retrieving a list of all orders, size: " + orders.size());
        return orders;
    }

    public String getOrderById(long id) {
        Mono<ResponseEntity<String>> responseEntityMono = webClient.get().uri("/orders/{id}", id).exchange().flatMap(clientResponse -> clientResponse.toEntity(String.class));
        ResponseEntity<String> responseEntity = responseEntityMono.block();
        assert responseEntity != null;

        String response;
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            response = responseEntity.getBody();
        } else {
            response = responseEntity.getBody();
        }
        logger.info("retrieving the order with id = " + id + ": " + response);
        return response;
    }

    public String createNewOrder(long carId, long customerId) {
        Order order = new Order(carId, customerId);
        Mono<ResponseEntity<String>> responseEntity =
                webClient.post().uri("/orders").body(Mono.just(order), Order.class).exchange().flatMap(clientResponse -> clientResponse.toEntity(String.class));
        String response = Objects.requireNonNull(responseEntity.block()).getBody();
        logger.info(response);
        return response;
    }

    public String deleteOrder(long id) {
        Mono<ResponseEntity<String>> responseEntityMono =
                webClient.delete().uri("/orders/{id}", id).exchange().flatMap(clientResponse -> clientResponse.toEntity(String.class));
        String response = Objects.requireNonNull(responseEntityMono.block()).getBody();
        logger.info(response);
        return response;
    }

    public String updateOrder(long id, String status) {
        Mono<ResponseEntity<String>> responseEntityMono =
                webClient.put().uri(uriBuilder -> uriBuilder.path("/orders/" + id).queryParam("status", status.toUpperCase()).build())
                        .exchange().flatMap(clientResponse -> clientResponse.toEntity(String.class));
        String response = Objects.requireNonNull(responseEntityMono.block()).getBody();
        logger.info(response);
        return response;
    }

    public List<Order> getOrdersByCustomerIdAndStatus(long customerId, String status) {
        List<Order> orders = webClient.get().uri("/orders/status?customerId={customerId}&status={status}", customerId, status.toUpperCase()).retrieve().bodyToFlux(Order.class).collectList().block();
        assert orders != null;
        logger.info("retrieving the list of all orders for customer with id=" + customerId + ", size: " + orders.size());
        return orders;
    }
}