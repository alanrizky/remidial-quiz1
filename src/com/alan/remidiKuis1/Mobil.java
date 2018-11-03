package com.alan.remidiKuis1;

public class Mobil {
    private String warna;
    private int maxSpeed;
    // test123
    public void carInfo() {
        System.out.println("Warna Mobil = " + warna + " | Kecepatan Maksimal = " + maxSpeed);
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
