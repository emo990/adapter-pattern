package mediaplayers;

import adapter.MediaAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.MediaPlayerService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AudioPlayerTest {

    @Test
    void playMp3ShouldReturnCorrectString() {
        AudioPlayer audioPlayer = new AudioPlayer();
        assertEquals("Playing mp3 file. Name: mp3.mp3", audioPlayer.play("mp3", "mp3.mp3"));
    }

    @Test
    void isMediaSupportedShouldCheckIfMediaIsSupportedAndReturnBoolean() {
        AudioPlayer audioPlayer = new AudioPlayer();
        MediaAdapter mediaAdapter = new MediaAdapter();
        mediaAdapter = mediaAdapter.generateAdapter();
        boolean actual = audioPlayer.isMediaSupported(mediaAdapter.getSupportedMedia(), "mp4");
        assertTrue(actual);
        actual = audioPlayer.isMediaSupported(mediaAdapter.getSupportedMedia(), "vlc");
        assertTrue(actual);
        actual = audioPlayer.isMediaSupported(mediaAdapter.getSupportedMedia(), "jpeg");
        assertFalse(actual);
    }

}