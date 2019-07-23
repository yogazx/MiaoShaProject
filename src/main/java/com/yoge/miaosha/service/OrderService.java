package com.yoge.miaosha.service;


import com.yoge.miaosha.error.BusinessException;
import com.yoge.miaosha.service.model.OrderModel;

public interface OrderService {

    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;
}
