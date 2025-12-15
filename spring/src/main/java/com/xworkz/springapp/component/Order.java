package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Order {

    private int orderId;
    private String orderType;

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public String getOrderType() { return orderType; }
    public void setOrderType(String orderType) { this.orderType = orderType; }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderType='" + orderType + '\'' +
                '}';
    }
}

