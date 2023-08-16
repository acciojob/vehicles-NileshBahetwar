package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
            this.name=name;
            this.currentSpeed=0;
            this.currentDirection=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }



    public void steer(int direction){
        // direction in degree
        this.currentDirection+=direction;
        System.out.println("steer method called - The direction is changed to: "+currentDirection);
    }

    public void move(int speed,int direction){
        // set the values of currSpeed and currDirection
        this.currentSpeed=speed;
        this.currentDirection=direction;

        System.out.println("move method called - The speed is changed to: "+currentSpeed+", and The direction is changed to: "+currentDirection);
    }

    public void stop(){
       this.currentSpeed=0;
        System.out.println(" stop method called - The vehicle is stopped");
    }
}
