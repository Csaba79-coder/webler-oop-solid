package com.csaba79coder.third.model;

import java.util.Objects;

public class Triangle extends Shape implements TriangleRuleI{

    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle() {
        this(0.0, 0.0, 0.0);
    }

    public Triangle(double aSide, double bSide, double cSide) {
        if (satisfiesTriangleInequality(aSide, bSide, cSide)) {
            this.aSide = aSide;
            this.bSide = bSide;
            this.cSide = cSide;
        } else {
            throw new IllegalArgumentException("Triangle rule doesn't satisfy equality");
        }
    }

    @Override
    public double perimeter() {
        return this.aSide + this.bSide + this.cSide;
    }

    @Override
    public double area() {
        double halfPerimeter = this.perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.aSide) * (halfPerimeter - this.bSide) * (halfPerimeter - this.cSide));
    }

    @Override
    public boolean satisfiesTriangleInequality(double aSide, double bSide, double cSide) {
        return (aSide < bSide + cSide) && (bSide < aSide + cSide) && (cSide < aSide + bSide);
    }

    public double getASide() {
        return aSide;
    }

    public double getBSide() {
        return bSide;
    }

    public double getCSide() {
        return cSide;
    }

    public void setASide(double aSide) {
        this.aSide = aSide;
    }

    public void setBSide(double bSide) {
        this.bSide = bSide;
    }

    public void setCSide(double cSide) {
        this.cSide = cSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getASide(), ((Triangle) o).aSide) == 0 &&
                Double.compare(triangle.getBSide(), ((Triangle) o).bSide) == 0 &&
                Double.compare(triangle.getCSide(), ((Triangle) o).cSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aSide, bSide, cSide);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + this.aSide +
                ", b=" + this.bSide +
                ", c=" + this.cSide +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
