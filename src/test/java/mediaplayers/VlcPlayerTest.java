package mediaplayers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VlcPlayerTest {

    @Test
    void playShouldReturnCorrectMessage() {
        VlcPlayer vlcPlayer = new VlcPlayer();
        String actual = vlcPlayer.play("vlc", "vlc.vlc");
        assertEquals("Playing vlc file. Name: vlc.vlc", actual);
    }
}