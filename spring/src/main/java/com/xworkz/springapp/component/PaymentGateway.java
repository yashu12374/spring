package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PaymentGateway {

    private int gatewayId;
    private String gatewayName;

    @Autowired
    private Transaction transaction;

    public int getGatewayId() { return gatewayId; }
    public void setGatewayId(int gatewayId) { this.gatewayId = gatewayId; }

    public String getGatewayName() { return gatewayName; }
    public void setGatewayName(String gatewayName) { this.gatewayName = gatewayName; }

    public Transaction getTransaction() { return transaction; }
    public void setTransaction(Transaction transaction) { this.transaction = transaction; }

    @Override
    public String toString() {
        return "PaymentGateway{" +
                "gatewayId=" + gatewayId +
                ", gatewayName='" + gatewayName + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}

