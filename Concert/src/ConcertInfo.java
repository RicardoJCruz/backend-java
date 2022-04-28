public class ConcertInfo implements Render{
    private String icon = "img\\icon.png";
    private String host = "\t\t\tCAFETERÍA: CAFÉ Y PAN\n\t\t\t\tPRESENTA";
    private String bar = "img\\bar.png";
    private String event = "\t  CONCIERTO DE\n\t\t  DELICADA\n\t\t  ARMONÍA";
    private String timePlace = "\t\t        18 DE JUNIO DE 2022. 7:00 P.M.\n\t\t\tEN NUESTRA TERRAZA";
    private String welcome = "\t\t\tVisítanos y reserva tus entradas\n\t\t\t\t¡Bienvenido!";
    public Band[] bands = {
            new Band("Sentire", "img\\band1.jpg", "songs\\song1.mp3"),
            new Band("S. Klepic", "img\\band2.jpg", "songs\\song2.mp3"),
            new Band("gravity", "img\\band3.jpg", "songs\\song3.mp3")
    };
    private String bandName;
    private String bandLogo;

    // Getters
    public String getIcon() {
        return icon;
    }
    public String getHost() {
        return host;
    }
    public String getBar() {
        return bar;
    }
    public String getEvent() {
        return event;
    }
    public String getTimePlace() {
        return timePlace;
    }
    public String getWelcome() {
        return welcome;
    }
    public Band[] getBands() {  return bands;  }
    public String getBandName() {  return bandName;  }
    public String getBandLogo() {  return bandLogo;  }

    // Setters
    public boolean setIcon(String icon) {
        if(!icon.isEmpty()) {
            this.icon = icon;
            return true;
        }
        return false;
    }

    public boolean setHost(String host) {
        if(!host.isEmpty()) {
            this.host = host;
            return true;
        }
        return false;
    }

    public boolean setBar(String bar) {
        if(!bar.isEmpty()) {
            this.bar = bar;
            return true;
        }
        return false;
    }

    public boolean setEvent(String event) {
        if(!event.isEmpty()) {
            this.event = event;
            return true;
        }
        return false;
    }

    public boolean setTimePlace(String timePlace) {
        if(!timePlace.isEmpty()) {
            this.timePlace = timePlace;
            return true;
        }
        return false;
    }

    public boolean setWelcome(String welcome) {
        if(!welcome.isEmpty()) {
            this.welcome = welcome;
            return true;
        }
        return false;
    }

    public boolean setBandName(String bandName) {
        if(!bandName.isEmpty()) {
            this.bandName = bandName;
            return true;
        }
        return false;
    }

    public boolean setBandLogo(String bandLogo) {
        if(!bandLogo.isEmpty()) {
            this.bandLogo = bandLogo;
            return true;
        }
        return false;
    }

    public void renderMessage(Screen screen, String message) {  screen.out(message, "Helvetica", 18, Colors.BalticSea);  }

    // Implementing interface Render

    @Override
    public void renderIcon(Screen screen) {
        screen.out("\t\t\t\t");
        screen.showImage(icon);
    }

    @Override
    public void renderHost(Screen screen) {  screen.out(host, "Helvetica", 18, Colors.BalticSea);  }

    @Override
    public void renderBar(Screen screen) {  screen.showImage(bar);  }

    @Override
    public void renderEvent(Screen screen) {  screen.out(event, "Georgia", 60, Colors.BalticSea);  }

    @Override
    public void renderTimePlace(Screen screen) {  screen.out(timePlace, "Helvetica", 18, Colors.BalticSea);  }

    @Override
    public void renderWelcome(Screen screen) {  screen.out(welcome, "Helvetica", 16, Colors.BalticSea);  }
}