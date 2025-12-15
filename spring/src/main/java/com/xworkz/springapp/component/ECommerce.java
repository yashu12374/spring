package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ECommerce {

    private int ecommerceId;
    private String ecommerceName;

    @Autowired
    private Order order;

    public int getEcommerceId() { return ecommerceId; }
    public void setEcommerceId(int ecommerceId) { this.ecommerceId = ecommerceId; }

    public String getEcommerceName() { return ecommerceName; }
    public void setEcommerceName(String ecommerceName) { this.ecommerceName = ecommerceName; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    @Override
    public String toString() {
        return "ECommerce{" +
                "ecommerceId=" + ecommerceId +
                ", ecommerceName='" + ecommerceName + '\'' +
                ", order=" + order +
                '}';
    }
}
