public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 10;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }

        this.currentVolume = currentVolume;
    }


}
