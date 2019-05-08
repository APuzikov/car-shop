/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mera.carshop.rest.api;

import com.mera.carshop.rest.model.OrderDTO;
import com.mera.carshop.rest.model.Status;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-25T22:43:42.430+03:00[Europe/Moscow]")

@Validated
@Api(value = "orders", description = "the orders API")
public interface OrdersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "create a new order", nickname = "createOrder", notes = "creating a new order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "CREATED"),
        @ApiResponse(code = 400, message = "BAD REQUEST"),
        @ApiResponse(code = 500, message = "INTERNAL ERROR") })
    @RequestMapping(value = "/orders",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createOrder(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OrderDTO orderDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "delete order", nickname = "deleteOrderById", notes = "order removal by id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "BAD REQUEST"),
        @ApiResponse(code = 500, message = "INTERNAL ERROR") })
    @RequestMapping(value = "/orders/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteOrderById(@ApiParam(value = "order id",required=true, defaultValue="null") @PathVariable("id") Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "get order", nickname = "getOrderById", notes = "getting order by id", response = OrderDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class),
        @ApiResponse(code = 400, message = "BAD REQUEST"),
        @ApiResponse(code = 500, message = "INTERNAL ERROR") })
    @RequestMapping(value = "/orders/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<OrderDTO> getOrderById(@ApiParam(value = "order id",required=true, defaultValue="null") @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"date\" : \"2019-04-03 13:06:51.260\",  \"customerId\" : 1,  \"id\" : 1,  \"carId\" : 1,  \"status\" : \"ACCEPTED\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "return a list of orders.", nickname = "getOrders", notes = "return a list of all existing orders", response = OrderDTO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BAD REQUEST") })
    @RequestMapping(value = "/orders",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<OrderDTO>> getOrders() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"date\" : \"2019-04-03 13:06:51.260\",  \"customerId\" : 1,  \"id\" : 1,  \"carId\" : 1,  \"status\" : \"ACCEPTED\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "get orders", nickname = "getOrdersByCustomerIdAndStatus", notes = "getting of orders by customer id and status", response = OrderDTO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "INTERNAL ERROR") })
    @RequestMapping(value = "/orders/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<OrderDTO>> getOrdersByCustomerIdAndStatus(@NotNull @ApiParam(value = "customer id", required = true, defaultValue = "null") @Valid @RequestParam(value = "customerId", required = true, defaultValue="null") Long customerId,@NotNull @ApiParam(value = "order status", required = true, defaultValue = "null") @Valid @RequestParam(value = "status", required = true, defaultValue="null") Status status) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"date\" : \"2019-04-03 13:06:51.260\",  \"customerId\" : 1,  \"id\" : 1,  \"carId\" : 1,  \"status\" : \"ACCEPTED\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "update order status", nickname = "updateOrderStatus", notes = "order status updating", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "BAD REQUEST"),
        @ApiResponse(code = 500, message = "INTERNAL ERROR") })
    @RequestMapping(value = "/orders/{id}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateOrderStatus(@ApiParam(value = "order id",required=true, defaultValue="null") @PathVariable("id") Long id,@NotNull @ApiParam(value = "new order status", required = true, defaultValue = "null") @Valid @RequestParam(value = "status", required = true, defaultValue="null") Status status) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
