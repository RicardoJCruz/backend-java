public class ConcertInfo implements Render{
    private String icon = "img\\icon.png";
    private String host = "CAFETERÍA: CAFÉ Y PAN PRESENTA";
    private String bar = "img\\bar.png";
    private String event = "CONCIERTO DE DELICADA ARMONÍA";
    private String timePlace = "18 DE JUNIO DE 2022. 7:00 P.M.\nEN NUESTRA TERRAZA";
    private String welcome = "Visítanos y reserva tus entradas\n¡Bienvenido!";
    public Band[] bands = {new Band("Sentire", "img\\band1.jpg"), new Band("Selena Klepic", "img\\band2.jpg"), new Band("gravity", "img\\band3.jpg")};
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

    // Implementing interface Render

    @Override
    public void renderIcon(Screen screen) {  screen.showImage(icon);  }

    @Override
    public void renderHost(Screen screen) {  screen.out(host);  }

    @Override
    public void renderBar(Screen screen) {  screen.showImage(bar);  }

    @Override
    public void renderEvent(Screen screen) {  screen.out(event);  }

    @Override
    public void renderTimePlace(Screen screen) {  screen.out(timePlace);  }

    @Override
    public void renderWelcome(Screen screen) {  screen.out(welcome);  }

    public void renderMessage(Screen screen, String message) {  screen.out(message);  }
}