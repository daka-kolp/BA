package com.dakakolp;

public class GravityCalculator {

    private final static double ACCELERATION = -9.81; //m/s^2

    private double time; //s
    private double velocity; // m/s
    private double position; // m


    public GravityCalculator() {
        this(0, 0);
    }

    public GravityCalculator(double velocity, double position) {
        this.velocity = velocity;
        this.position = position;
    }

    public double calcDist(double time) {
        this.time = time;
        double position = ACCELERATION * Math.pow(this.time, 2) * 0.5 + this.velocity * time + this.position;
        this.position = position;
        return this.position;
    }
}
