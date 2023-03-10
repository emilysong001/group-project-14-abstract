package com.devxschool;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SamsungTest {

    Samsung samsung = new Samsung("11", "12 MP", "FID", 0);

    @Test
    public void getTypeTest() {
        assertEquals("11", samsung.getType());
    }

    @Test
    public void getCameraSpecsTest() {
        assertEquals("12 MP", samsung.getCameraSpecs());
    }

    @Test
    public void setCameraSpecsTest() {
        samsung.setCameraSpecs("12");
        assertEquals("12", samsung.getCameraSpecs());
    }

    @Test
    public void callTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.call("911");

        String expected = "Calling to 911 from Samsung...";

        TestCase.assertEquals("Output of call method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void textTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.text("911", "A");

        String expected = "Sending a message \"A\" to 911 from Samsung...";

        TestCase.assertEquals("Output of text method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void takePhotoTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.takePhoto();

        String expected = "Taking a photo from Samsung 11 with 12 MP";

        TestCase.assertEquals("Output of takePhoto method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void unlockTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.unlock();

        String expected = "Unlocking using FID";

        TestCase.assertEquals("Output of unlock method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void printExternalStorageSizeTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String expected = "Samsung 11 has external storage of size: 1";

        samsung.setExternalStorage(1);

        assertEquals("Storage size", java.util.Optional.of(samsung.getExternalStorage()).get(), Integer.valueOf(1));
        samsung.printExternalStorageSize();

        assertEquals("Output of printExternalStorageSize method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }
}
