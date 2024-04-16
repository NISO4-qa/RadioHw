public class Radio {

    private final int maxStation;
    private final int minStation = 0;
    private final int numberOfStation;
    private int currentRadioStation;
    private int currentVolume;

    public Radio(int amountStation) {
        this.numberOfStation = amountStation;
        maxStation = amountStation - 1;
    }

    public Radio() {
        numberOfStation = 10;
        maxStation = numberOfStation - 1;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
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
        if (currentRadioStation == maxStation) {
            setCurrentRadioStation(minStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);

        }
    }

    public void prev() {
        if (currentRadioStation == minStation) {
            setCurrentRadioStation(maxStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);

        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}




