package com.java;

// TODO CONFIGURE THE CLASS
public class Samsung extends CellPhone {
//*  create a new brand of cell phone type called Samsung
//         *   + this brand should have following specs
//         *      - type -> encapsulated, immutable and with dataType of String
//         *      - cameraSpecs -> encapsulated and with dataType of String
//         *      - security -> encapsulated, immutable and with dataType of String
//         *      - externalStorage -> encapsulated and with dataType of Integer
//         *   + Construct and initialize above fields
//         *
//         *  + Implement all methods cell phone abstract class
//         *      - implement getter and setter for "type" and "externalStorage" fields
//         *      - implement call method so that when entered a phone number 911 it prints 'Calling to 911 from Samsung...'
//         *      - implement text method so that when entered a phone number 101 with message "help" it prints 'Sending message "help" to 101 from Samsung...'
//         *      - implement takePhoto method so that it prints 'Taking a photo from Samsung {type} with {cameraSpecs}'
//         *      - implement unlock method so that it prints 'Unlocking using {security}'
//         *      - create a method printExternalStorageSize so that it prints 'Samsung {type} has external storage of size: {externalStorage}'
//         *

    private String type;
    private String cameraSpecs;
    private String security;
    private int externalStorage;

    public Samsung(String type, String cameraSpecs, String security, int externalStorage) {
        this.type = type;
        this.cameraSpecs = cameraSpecs;
        this.security = security;
        this.externalStorage = externalStorage;
    }

    public int getExternalStorage() {
        return externalStorage;
    }

    public void setExternalStorage(int externalStorage) {
        this.externalStorage = externalStorage;
    }

    @Override
    public String getType() {
        return type;
    }

    public String getCameraSpecs() {
        return cameraSpecs;
    }

    public void setCameraSpecs(String cameraSpecs) {
        this.cameraSpecs = cameraSpecs;
    }

    @Override
    public String getSecurity() {
        return security;
    }

    @Override
    public void call(String number) {
        System.out.println("Calling to "+number+" from Samsung...");
    }

    @Override
    public void text(String number, String message) {
        System.out.println("Sending message \""+message+"\" to "+number+" from Samsung...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo from Samsung {"+getType()+"} with {"+getCameraSpecs()+"}");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using {"+security+"}");
    }

    public void printExternalStorageSize(){
        System.out.println("Samsung {"+getType()+"} has external storage of size: {"+getExternalStorage()+"}");
    }

}
