package org.example;

public class PianoChair extends Chair{
    private int height;



    public PianoChair(int foundationYear, double cost, int height) {
        super(foundationYear, cost);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PianoChair{" +
                "height=" + height +
                " foundationYear=" + getFoundationYear() +" "+
                " cost=" + getCost() + " "+
                '}';
    }
}
