package edu.ucalgary.oop;

public class Teapot {

    private boolean hasWater;
    private Teabag teabag;

    public Teapot() {
        hasWater = false;
        teabag = null;
    }

    public void addWater() {
        hasWater = true;
        System.out.println("Water added to the teapot.");
    }

    public void addTeabag(Teabag bag) {
        teabag = bag;
        System.out.println(bag.getTeaType() + " teabag added.");
    }

    public void removeTeabag() {
        teabag = null;
        System.out.println("Teabag removed.");
    }

    public void brewTea() {
        if (hasWater && teabag != null) {
            System.out.println("Brewing " + teabag.getTeaType() + " tea.");
        } else {
            System.out.println("Cannot brew tea.");
        }
    }
}
