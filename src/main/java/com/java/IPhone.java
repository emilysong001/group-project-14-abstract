package com.java;

// TODO CONFIGURE THE CLASS
public class IPhone extends CellPhone{
//*   + this brand should have following specs
//         *      - type -> encapsulated, immutable and with dataType of String
//         *      - cameraSpecs -> encapsulated and with dataType of String
//         *      - security -> encapsulated, immutable and with dataType of String
//         *   + Construct and initialize above fields

    // * + Implement all methods cell phone abstract class
    //         *      - implement getter and setter for "cameraSpecs" fields
    //         *      - implement call method so that when entered a phone number 911 it prints 'Calling to 911 from iPhone...'
    //         *      - implement text method so that when entered a phone number 101 with message "help" it prints 'Sending message "help" to 101 from iPhone...'
    //         *      - implement takePhoto method so that it prints 'Taking a photo from iPhone {type} with {cameraSpecs}'
    //         *      - implement unlock method so that it prints 'Unlocking using {security}'

    private String type;
    private String cameraSpecs;
    private String security;

    public IPhone(String type, String cameraSpecs, String security) {
        this.type = type;
        this.cameraSpecs = cameraSpecs;
        this.security = security;
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
        System.out.println("Calling to "+number+" from iPhone...");
    }

    @Override
    public void text(String number, String message) {
        System.out.println("Sending a message \""+message+"\" to "+number+" from iPhone...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo from iPhone "+getType()+" with "+getCameraSpecs());
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using "+getSecurity());
    }



}
