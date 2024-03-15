package ru.netology.radio;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (getCurrentStation() == 9) {
            setCurrentStation(0);
        } else setCurrentStation(getCurrentStation() + 1);
    }

    public void prev() {
        if (getCurrentStation() == 0) {
            setCurrentStation(9);
        } else setCurrentStation(getCurrentStation() - 1);
    }


    public void volumeUp() {
        if (getCurrentVolume() < 100) {
            setCurrentVolume(getCurrentVolume() + 1);
        }
        if (getCurrentVolume() == 100) {
            setCurrentVolume(getCurrentVolume());
        }
    }

    public void volumeDown() {
        if (getCurrentVolume() > 0) {
            setCurrentVolume(getCurrentVolume() - 1);
        }
        if (getCurrentVolume() == 0) {
            setCurrentVolume(getCurrentVolume());
        }
    }
}
