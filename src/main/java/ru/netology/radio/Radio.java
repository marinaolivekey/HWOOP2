package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;

@NoArgsConstructor
@Getter
public class Radio {
    private int minStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int currentVolume = minVolume;


    // конструкторы
    public Radio(int quantityStations) {
        this.maxStation = quantityStations - 1;
    }

    // сеттеры

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > getMaxStation()) {
            return;
        }
        if (newCurrentStation < getMinStation()) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        this.currentVolume = newCurrentVolume;
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
        /*
    public Radio() {
    }


        // гетеры
    public int getCurrentStation() {
        return currentStation;
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

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
    */
}
