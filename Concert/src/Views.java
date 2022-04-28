import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Views extends ConcertInfo{
    private String bandName;
    private String bandLogo;
    Screen screen;
    Band[] bands;

    public Views(Screen screen, Band[] bands) {
        this.screen = screen;
        this.bands = bands;
    }

    // Getters
    public String getBandName() {  return bandName;  }
    public String getBandLogo() {  return bandLogo;  }

    // Setters
    public boolean setBandName(String bandName) {
        if(!bandName.isEmpty()) {
            this.bandName = bandName;
            return true;
        }
        return false;
    }

    public boolean setBandLogo(String bandLogo){
        if(!bandLogo.isEmpty()) {
            this.bandLogo = bandLogo;
            return true;
        }
        return false;
    }

    // Methods
    public void renderBandName(Screen screen) {
        screen.out("\t\t\t  ");
        screen.out(bandName, "Georgia", 60, Colors.BalticSea);
    }

    public void renderBandLogo(Screen screen) {
        screen.out("                 ");
        screen.showImage(bandLogo);
    }

    public void makeFrontPage () {
        renderIcon(screen);
        screen.out("\n\n");
        renderHost(screen);
        screen.out("\n\n");
        renderBar(screen);
        screen.out("\n\n");
        renderEvent(screen);
        screen.out("\n\n");
        renderBar(screen);
        screen.out("\n\n");
        renderTimePlace(screen);
        screen.out("\n\n");
        renderWelcome(screen);
    }

    public void makeBandPage (){


        for (int i = 0, n = bands.length; i < n; i++) {

            String song = bands[i].getSong();
            Runnable r = new Runnable() {
                @Override
                public void run() {

                    try {
                        FileInputStream fis = new FileInputStream(song);
                        Player player = new Player(fis);
                        player.play(175);
                        player.close();
                        fis.close();
                    } catch (JavaLayerException | IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            new Thread(r).start();

            setBandName(bands[i].getName());
            setBandLogo(bands[i].getLogo());
            screen.cls();
            renderMessage(screen, "\t\t\t    PRESENTANDO A");
            screen.out("\n\n");
            renderBar(screen);
            screen.out("\n\n");
            renderBandName(screen);
            screen.out("\n\n");
            renderBandLogo(screen);
            screen.out("\n\n");
            renderBar(screen);
            screen.out("\n\n");
            renderMessage(screen, "\t\t        18 DE JUNIO DE 2022. " + (i + 7) + ":00 P.M.\n\t\t    CAFETERÍA: CAFÉ Y PAN, TERRAZA");
            screen.out("\n\n");
            renderWelcome(screen);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void makeLineUp () {
        screen.cls();
        renderIcon(screen);
        screen.out("\n\n");
        renderHost(screen);
        screen.out("\n\n");
        renderBar(screen);
        screen.out("\n\n");
        renderEvent(screen);
        screen.out("\n\n");
        renderMessage(screen,"\t\t\t\t   CON");
        screen.out("\n\n");
        for (int i = 0, n = bands.length; i < n; i++) {
            setBandName(bands[i].getName());
            setBandLogo(bands[i].getLogo());
            renderBandName(screen);
            screen.out("\n");
            renderBandLogo(screen);
            screen.out("\n\n");
        }
        renderBar(screen);
        screen.out("\n\n");
        renderTimePlace(screen);
        screen.out("\n\n");
        renderWelcome(screen);
    }
}
