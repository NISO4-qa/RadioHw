import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(5);

        int expected = 5;
        int actual = cond.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
@Test
    public void shouldNotSetAboveMaxStation() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(10);
        int expected = 0;
        int actual = cond.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
}
@Test
    public void shouldNotSetBelowMinStation(){
        Radio cond = new Radio();
        cond.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = cond.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
}
    @Test
    public void shouldSetVolume(){
        Radio cond = new Radio();
        cond.setCurrentVolume(60);
        int expected =60;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
}
    @Test
    public void shouldNotIncreaseVolumeAboveMax(){
        Radio cond = new Radio();
 cond.setCurrentVolume(101);
 int expected = 0;
 int actual = cond.getCurrentVolume();
 Assertions.assertEquals(expected, actual);
}
@Test
    public void shouldNotDescreaseVolumeBelowMin(){
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
}
}
