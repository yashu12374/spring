package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FinanceCompany {

    private int companyId;
    private String companyName;

    @Autowired
    private Auditor auditor;

    public int getCompanyId() { return companyId; }
    public void setCompanyId(int companyId) { this.companyId = companyId; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public Auditor getAuditor() { return auditor; }
    public void setAuditor(Auditor auditor) { this.auditor = auditor; }

    @Override
    public String toString() {
        return "FinanceCompany{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", auditor=" + auditor +
                '}';
    }
}

