package com.csaba79coder.solid.srp;

public class ReportGeneratorWrong {

    // Egy osztálynak egy felelőssége van, ezért ez nem egy jó megközelítés a Single Responsibiity elv miatt!
    // a probléma, hogy két dolgot csinál, egyik generál egy riportot, a másik metódus pedig elmenti azt
    // szedjük szét lehetőség szerint a funkciókat a felősség alapján (SingleResponsibility Principle)

    public void generateReport() {
        // implement the logic
    }

    public void saveToFile() {
        // implement the logic
    }
}
