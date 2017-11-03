/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author lionsibi
 */
public class Phone {
    private String model;
    private String CPU;
    private int RAM;
    private double camera;
    private double screen;

    public Phone(String model, String CPU, int RAM, double camera, double screen) {
        this.model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        this.camera = camera;
        this.screen = screen;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return String.format("|%-8s|%-8s|%3d|%4.2f|%4.2f|", model, CPU, RAM, camera, screen);
    }
    
    
}
