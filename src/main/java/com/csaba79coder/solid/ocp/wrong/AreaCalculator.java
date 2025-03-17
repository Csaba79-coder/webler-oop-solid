package com.csaba79coder.solid.ocp.wrong;

public class AreaCalculator {

    Shape shape = new Shape();

    // ez akkor lenne jó, ha rengeteg sok sok alakzat if-else változatát végig irnánk, mi van, ha valamit kihagyunk stb.
    public Double calculateArea(String type) {
        if (shape.type.equals("circle")) {
            return Math.PI * shape.getRadius() * shape.getRadius();
        } else if (shape.type.equals("rectangle")) {
            return null;
        }
        return null;
    }
}
