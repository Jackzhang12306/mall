package com.icoding.service;

import com.icoding.bo.SubmitOrderBO;

public interface OrdersService {
  String createOrder(SubmitOrderBO submitOrderBO);
  void updateOrderStatus(String orderId, Integer orderStatus);
}
