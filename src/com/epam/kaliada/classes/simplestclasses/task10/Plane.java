package com.epam.kaliada.classes.simplestclasses.task10;

public class Plane {
    private PlaneProducer planeProducer;
    private String model;

    public Plane(PlaneProducer planeProducer, String model) {
        this.planeProducer = planeProducer;
        this.model = model;
    }

    public PlaneProducer getPlaneProducer() {
        return planeProducer;
    }

    public void setPlaneProducer(PlaneProducer planeProducer) {
        this.planeProducer = planeProducer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
