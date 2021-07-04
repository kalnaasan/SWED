package de.swed.user;

import java.util.ArrayList;
import java.util.List;

public class Contractor extends User {

    private ContractorStatus status;
    private List<Rating> ratings = new ArrayList<>();
    private List<ContractorCommission> commissions = new ArrayList<>();

    public ContractorStatus getStatus() {
        return status;
    }

    public void setStatus(ContractorStatus status) {
        this.status = status;
    }
}
