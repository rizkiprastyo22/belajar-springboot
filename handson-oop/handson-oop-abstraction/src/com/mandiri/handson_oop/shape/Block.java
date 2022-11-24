package com.mandiri.handson_oop.shape;

public class Block extends Rectangle{

    private Double height;

    public Block(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public Double getSurface() {
        return 2 * (this.length * this.width) + 2 * (this.length * this.height) + 2 * (this.width * this.height) ;
    }

    @Override
    public Double getRound() {
        return 4 * (this.length + this.width + this.height);
    }

    public Double getVolume() {
        return this.height * this.width * this.length;
    }

    @Override
    public String toString() {
        return "Block{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
