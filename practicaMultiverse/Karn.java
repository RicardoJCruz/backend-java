public class Karn extends Spiderman implements KarnPowers{

    public Karn() {
        // Setea los atributos al crear un objeto con el constructor por defecto
        // De esta forma todos los objetos Karn iniciaran con estos atributos
        setName("Karn");
        setAlias("Master Weaver");
        setGender("Male ♂");
        setReality("Earth-001");
        setIdentity("Secret");
    }

    // Si se utiliza el Constructor parametrizado es necesario setear los atributos manualmente
    public Karn(String name, String alias, String gender, String reality, String identity) {
        super(name, alias, gender, reality, identity);
    }

    @Override
    public void portalCreation(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.BlueHorizon);
        s.out("\n  Power: Portal Creation\n", "Arial Black", 28, Colors.LighterPurple);
        s.showImage("./img/karn-portal.jpeg");
        powerDescription(s, "As The Master Weaver, Karn was able to create a sort of inter-dimensional portal that connected to the various alternate reality and sent people to another reality that they want.");
    }

    @Override
    public void realityManipulation(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.BlueHorizon);
        s.out("\tPower: Reality Manipulation\n", "Arial Black", 28, Colors.LighterPurple);
        s.out("                                       ");
        s.showImage("./img/karn-reality-manipulation1.jpg");
        powerDescription(s, "The Master Weaver can warp reality by snapping strands of the web.");
    }

    public void staff(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.BlueHorizon);
        s.out("\tPower: Staff\n", "Arial Black", 28, Colors.LighterPurple);
        s.out("                                       ");
        s.showImage("./img/karn-staff1.jpg");
        powerDescription(s, "Karn possesses a two pronged staff that expels unique energy.");
    }
}
