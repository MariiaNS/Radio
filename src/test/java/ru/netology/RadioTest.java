package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int actual = radio.getCurrentStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenCurrentVolumeIsMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(1);
        radio.prev();

        int actual = radio.getCurrentStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevWhenCurrentStationIsMin() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.prev();

        int actual = radio.getCurrentStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);
        radio.next();

        int actual = radio.getCurrentStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextWhenCurrentStationIsMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.next();

        int actual = radio.getCurrentStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(52);

        radio.increaseVolume();

        int expected = 53;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseWhenVolumeIsMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);

        radio.decreaseVolume();

        int expected = 54;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseWhenVolumeIsMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}