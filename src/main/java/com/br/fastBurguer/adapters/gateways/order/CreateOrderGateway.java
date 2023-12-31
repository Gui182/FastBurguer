package com.br.fastBurguer.adapters.gateways.order;

import java.util.List;

import com.br.fastBurguer.core.entities.Order;

public interface CreateOrderGateway {
    
    public Order createOrder(Long clientId, List<Long> products); 
}
