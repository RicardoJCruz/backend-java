public class Views extends ConcertInfo{
    private String bandName;
    private String bandLogo;
    Screen screen;
    Band[] bands;

    public Views(Screen screen, Band[] bands) {
        this.screen = screen;
        this.bands = bands;
    }

    // Getter
    public String getBandName() {
        return bandName;
    }

    public String getBandLogo() {
        return bandLogo;
    }

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

    // Setter
    public void renderBandName(Screen screen) {
        screen.out(bandName);
    }

    public void renderBandLogo(Screen screen) {
        screen.showImage(bandLogo);
    }

    public void makeFrontPage () {
        renderIcon(screen);
        screen.out("\n");
        renderHost(screen);
        screen.out("\n");
        renderBar(screen);
        screen.out("\n");
        renderEvent(screen);
        screen.out("\n");
        renderBar(screen);
        screen.out("\n");
        renderTimePlace(screen);
        screen.out("\n");
        renderWelcome(screen);
    }

    // Methods
    public void makeBandPage () {
        for (int i = 0, n = bands.length; i < n; i++) {
            setBandName(bands[i].getName());
            setBandLogo(bands[i].getLogo());
            screen.cls();
            renderMessage(screen, "PRESENTANDO A");
            screen.out("\n");
            renderBar(screen);
            screen.out("\n");
            renderBandName(screen);
            screen.out("\n");
            renderBandLogo(screen);
            screen.out("\n");
            renderBar(screen);
            screen.out("\n");
            renderMessage(screen, "18 DE JUNIO DE 2022. 7:00 P.M.\nCAFETERÍA: CAFÉ Y PAN, TERRAZA");
            screen.out("\n");
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
        renderHost(screen);
        screen.out("\n");
        renderBar(screen);
        screen.out("\n");
        renderEvent(screen);
        screen.out("\n");
        renderMessage(screen,"CON:");
        screen.out("\n");
        for (int i = 0, n = bands.length; i < n; i++) {
            setBandName(bands[i].getName());
            setBandLogo(bands[i].getLogo());
            renderBandName(screen);
            screen.out("\n");
            renderBandLogo(screen);
            screen.out("\n");
        }
        renderBar(screen);
        screen.out("\n");
        renderTimePlace(screen);
        screen.out("\n");
        renderWelcome(screen);
    }
}
