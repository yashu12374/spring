package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ShippingCompany {

    private int companyId;
    private String companyName;

    @Autowired
    private Container container;

    public int getCompanyId() { return companyId; }
    public void setCompanyId(int companyId) { this.companyId = companyId; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public Container getContainer() { return container; }
    public void setContainer(Container container) { this.container = container; }

    @Override
    public String toString() {
        return "ShippingCompany{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", container=" + container +
                '}';
    }
}

