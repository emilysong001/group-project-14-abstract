package com.devxschool;

public abstract class CellPhone {
 //* Cell phone must have features like
 //         *      - getType(); - returns cell phone version
 //         *      - setType(String type); - sets cell phone version
 //         *      - call(String number); - calls to a given number
 //         *      - text(String number, String message); - sends a message to a given number
 //         *      - takePhoto(); - takes a photo on camera
 //         *      - unlock(); - unlocks cell phone with a given security
    public abstract String getType();

    public abstract String getCameraSpecs();
   public abstract String getSecurity();

    public abstract void setCameraSpecs(String cameraSpecs);

    public abstract void call(String number);

    public abstract void text(String number, String message);

    public abstract void takePhoto();

    public abstract void unlock();




}
