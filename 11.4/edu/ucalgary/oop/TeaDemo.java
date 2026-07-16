package edu.ucalgary.oop;

public class TeaDemo {

    public static void main(String[] args) {

        Teapot pot = new Teapot();
        Teabag bag = new Teabag("Green");

        pot.addWater();
        pot.addTeabag(bag);
        pot.brewTea();
        pot.removeTeabag();
    }
}