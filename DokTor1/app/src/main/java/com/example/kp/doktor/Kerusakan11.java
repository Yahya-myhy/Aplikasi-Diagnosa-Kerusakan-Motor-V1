package com.example.kp.doktor;

public class Kerusakan11 {
    private double g20,g21;
    private double g20Rule, g21Rule;
    private double cf1, cf2;
    private double cfc1;
    double hasil;

    public Kerusakan11(double g20, double g21) {
        this.g20 = g20;
        this.g21 = g21;

        this.g20Rule = 0.8;
        this.g21Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g20 * this.g20Rule;
        this.cf2 = this.g21 * this.g21Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.hasil = this.cfc1;
    }
    public double getHasil() {

        return this.hasil;
    }
}
