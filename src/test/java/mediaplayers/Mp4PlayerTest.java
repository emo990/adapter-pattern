package mediaplayers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp4PlayerTest {

    @Test
    void playShouldReturnCorrectMessage() {
    Mp4Player mp4Player = new Mp4Player();
        String actual = mp4Player.play("mp4", "mp4.mp4");
        assertEquals("Playing mp4 file. Name: mp4.mp4", actual);
    }
}