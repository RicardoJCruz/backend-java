import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.IOException;

public class Music implements Runnable {
    private Band[] bands = new ConcertInfo().bands;

    @Override
    public void run() {
        try {
            // Reproduce la misma pista musical del artista
            for (int i = 0, n = bands.length; i < n; i++) {
                String song = bands[i].getSong();
                FileInputStream fis = new FileInputStream(song);
                Player player = new Player(fis);
                player.play(200);
                player.close();
                fis.close();
            }
        } catch (JavaLayerException | IOException e) {
            e.printStackTrace();
        }
    }
}
