package ru.netology.radio;

public class Radio {
    private final int minStation = 0;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int currentVolume = minVolume;

    // конструкторы
    public Radio(int quantityStations) {
        this.maxStation = quantityStations - 1;
    }

    public Radio() {
    }

    // гетеры
    public int getCurrentStation() {
        return currentStation;
    }

    // сеттеры
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > getMaxStation()) {
            return;
        }
        if (newCurrentStation < getMinStation()) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
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

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    //методы
    public void next() {
        if (getCurrentStation() == getMaxStation()) {
            setCurrentStation(getMinStation());
        } else {
            setCurrentStation(getCurrentStation() + 1);
        }
    }

    public void prev() {
        if (getCurrentStation() == getMinStation()) {
            setCurrentStation(getMaxStation());
        } else {
            setCurrentStation(getCurrentStation() - 1);
        }
    }


    public void volumeUp() {
        if (getCurrentVolume() < getMaxVolume()) {
            setCurrentVolume(getCurrentVolume() + 1);
        }
        if (getCurrentVolume() == getMaxVolume()) {
            setCurrentVolume(getCurrentVolume());
        }
    }

    public void volumeDown() {
        if (getCurrentVolume() > getMinVolume()) {
            setCurrentVolume(getCurrentVolume() - 1);
        }
        if (getCurrentVolume() == getMinVolume()) {
            setCurrentVolume(getCurrentVolume());
        }
    }
}
