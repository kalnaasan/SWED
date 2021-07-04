package de.swed.control;

public class Cost {
    private Long id;
    private CostArt costArt;
    private double value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CostArt getCostArt() {
        return costArt;
    }

    public void setCostArt(CostArt costArt) {
        this.costArt = costArt;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
