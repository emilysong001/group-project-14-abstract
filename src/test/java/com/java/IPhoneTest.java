package com.java;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class IPhoneTest {

    IPhone iPhone = new IPhone("11", "12 MP", "FID");

    @Test
    public void getTypeTest() {
        assertEquals("11", iPhone.getType());
    }

    @Test
    public void getCameraSpecsTest() {
        assertEquals("12 MP", iPhone.getCameraSpecs());
    }

    @Test
    public void setCameraSpecsTest() {
        iPhone.setCameraSpecs("12");
        assertEquals("12", iPhone.getCameraSpecs());
    }

    @Test
    public void callTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        iPhone.call("911");
        String expected = "Calling to 911 from iPhone...";
        TestCase.assertEquals("Output of call method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void textTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        iPhone.text("911", "A");
        String expected = "Sending a message \"A\" to 911 from iPhone...";
        TestCase.assertEquals("Output of text method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void takePhotoTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        iPhone.takePhoto();
        String expected = "Taking a photo from iPhone 11 with 12 MP";
        TestCase.assertEquals("Output of takePhoto method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void unlockTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        iPhone.unlock();
        String expected = "Unlocking using FID";
        TestCase.assertEquals("Output of unlock method", expected, out.toString().replace("\n", "").replace("\r", ""));

    }
}
