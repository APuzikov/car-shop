package com.mera.carshop.rest.api;

import com.mera.carshop.rest.model.OrderDTO;
import com.mera.carshop.rest.model.Status;
import com.mera.carshop.rest.service.OrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-25T22:43:42.430+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.carShopRestServer.base-path:/api}")
public class OrdersApiController implements OrdersApi {

    private static final Logger logger = LogManager.getLogger(OrdersApiController.class);

    private final NativeWebRequest request;
    private OrderService orderService;

    @Autowired
    public OrdersApiController(NativeWebRequest request, OrderService orderService) {
        this.request = request;
        this.orderService = orderService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity getOrders() {
        List<OrderDTO> orderDTOS = orderService.getAllOrders();
        return new ResponseEntity<List<OrderDTO>>(orderDTOS, HttpStatus.OK);
    }

    @Override
    public ResponseEntity getOrderById(@PathVariable Long id) {
        try {
            OrderDTO orderDTO = orderService.getOrderById(id);
            return new ResponseEntity<OrderDTO>(orderDTO, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("unable to get the order: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity createOrder(@Valid @RequestBody OrderDTO orderDTO) {
        try {
            orderDTO.setStatus(Status.ACCEPTED.toString());
            orderDTO.setDate(new Date().toString());
            orderService.createOrder(orderDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body("order was successfully created");
        } catch (Exception e) {
            logger.error("unable to create order: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity deleteOrderById(@PathVariable Long id) {
        try {
            orderService.deleteOrder(id);
            return ResponseEntity.status(HttpStatus.OK).body("order was successfully deleted");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity updateOrderStatus(@PathVariable Long id, @RequestParam @NotNull @Valid Status status) {
        try {
            orderService.updateOrder(id, status.toString());
            return ResponseEntity.status(HttpStatus.OK).body("order status was successfully updated");
        } catch (Exception e) {
            logger.error("unable to update order status: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<List<OrderDTO>> getOrdersByCustomerIdAndStatus(@RequestParam @NotNull @Valid Long customerId, @RequestParam @NotNull @Valid Status status) {
        List<OrderDTO> orderDTOS = orderService.getOrdersByCustomerIdAndStatus(customerId, status.toString());
        return new ResponseEntity<List<OrderDTO>>(orderDTOS, HttpStatus.OK);
    }
}
