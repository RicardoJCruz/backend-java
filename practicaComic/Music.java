import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.IOException;

public class Music implements Runnable {

    @Override
    public void run() {
        try {
            // Reproduce la misma pista musical 6 veces (3 minutos)
            for (int i = 0; i < 6; i++) {
                FileInputStream fis = new FileInputStream("src\\Eternity.mp3");
                Player player = new Player(fis);
                player.play();
                player.close();
                fis.close();
            }
        } catch (JavaLayerException | IOException e) {
            e.printStackTrace();
        }
    }
}
