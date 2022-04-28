public class Band {
    private String name;
    private String logo;
    private String song;

    public Band(String name, String logo, String song) {
        this.name = name;
        this.logo = logo;
        this.song = song;
    }

    public String getName() {  return name;  }
    public String getLogo() {  return logo;  }
    public String getSong() {  return song;  }

    public boolean setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }
        return false;
    }
    public boolean setLogo(String logo) {
        if(!logo.isEmpty()){
            this.logo = logo;
            return true;
        }
        return false;
    }

    public boolean setSong(String song) {
        if(!song.isEmpty()){
            this.song = song;
            return true;
        }
        return false;
    }
}
