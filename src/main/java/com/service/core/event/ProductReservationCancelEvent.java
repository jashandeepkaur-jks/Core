package com.service.core.event;

import lombok.Builder;
import lombok.Data;

@Data
public class ProductReservationCancelEvent {

    private  String productId;
    private  String orderId;
    private  String userId;
    private  int quantity;
    private  String reason;

}
