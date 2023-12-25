package com.br.fastBurguer.infra.controllers.order;

import java.util.ArrayList;
import java.util.List;

import com.br.fastBurguer.application.gateways.FindProductByIdGateway;
import com.br.fastBurguer.core.entities.Client;
import com.br.fastBurguer.core.entities.Order;
import com.br.fastBurguer.core.entities.Product;

public class OrderDTOMapper {

    private final FindProductByIdGateway findProductByIdGateway;

    public OrderDTOMapper(FindProductByIdGateway findProductByIdGateway) {
        this.findProductByIdGateway = findProductByIdGateway;
    }

    public Order toOrder(CreateOrderRequest createOrderRequest) {

        List<String> products = new ArrayList<>();
        for (Long id : createOrderRequest.products()) {
            Product product = findProductByIdGateway.findProductById(id);
            products.add(product.getName());
        }

        return new Order(new Client(), products);
    }

    public FindAllOrdersResponse toListResponse(List<Order> orders) {
        return new FindAllOrdersResponse(orders);
    }
}
