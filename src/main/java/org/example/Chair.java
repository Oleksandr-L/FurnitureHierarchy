package org.example;

public  class Chair implements Furniture {

    private int foundationYear;
    private double cost;

    public Chair() {
    }

    /**
     *
     * @param foundationYear
     * @param cost
     */
    public Chair(int foundationYear, double cost) {
        this.foundationYear = foundationYear;
        this.cost = cost;
    }


    @Override
    public int getFoundationYear() {
        return this.foundationYear;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "foundationYear=" + foundationYear +
                ", cost=" + cost +
                '}';
    }
}
