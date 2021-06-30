package de.swed.user;

public class ContractorComission {
    private long id;
    private double price;
    private double permission;

    public void setId(long id){
        this.id = id;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void permission(double permission){
        this.permission = permission;
    }

    private double calcPermission(long id, double price){
        return this.permission;
    }

}
