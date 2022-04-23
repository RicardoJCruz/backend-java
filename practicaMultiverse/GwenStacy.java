public class GwenStacy extends Spiderman implements GwenStacyPowers{
    public GwenStacy() {

    }

    public GwenStacy(String name, String alias, String gender, String reality, String identity) {
        super(name, alias, gender, reality, identity);
    }


    @Override
    public void shootWeb(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("\tPower: Shoot web\n", "Arial Black", 28, Colors.LighterPurple);
        s.showImage("./img/gs-web-shoot.jpg");
        powerDescription(s, "Given to Gwen by Janet Van Dyne. They trap moisture from the air to create a \"web-fluid\" that allows her to eject web ropes, nets, and globs.");
    }

    @Override
    public void DimesionalTravel(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("\tPower: Dimensional Travel\n", "Arial Black", 28, Colors.LighterPurple);
        s.showImage("./img/gs-dimensional-travel.jpg");
        powerDescription(s, "Gwen can travel between dimensions with a pendant that is essentially a modified Dimensional Travel Watch that's specifically keyed to her body's unique radiation signature.");
    }
}
