
package ru.netology;

public class Radio {

    private int currentStationNumber;
    private int currentVolume;

    private int maxStation;


    public Radio() {
        this.maxStation = 9;


    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;

    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > maxStation) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStationNumber != maxStation) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }

    }

    public void prev() {
        if (currentStationNumber != 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStation;
        }

    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}





