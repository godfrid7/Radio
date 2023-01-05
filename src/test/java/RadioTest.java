import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(99);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NegativeVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-5);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lineTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bottomTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxsimumVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(13);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderLineTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(101);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveLineTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(99);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highestLineTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highestVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.nextVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void bestVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.nextVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void downVolumeTest() {
        Radio radio  = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void throwVolumeTest() {
        Radio radio  = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        radio.prevVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void mustVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.prevVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void MaxValidVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.prevVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);

        radio.prevVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextTest() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(19);

        int actual = radio.getCurrentStation();
        int expected = 19;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validNewTest() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(18);

        int actual = radio.getCurrentStation();
        int expected = 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroNewTest() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroTest() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxZeroTest() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
