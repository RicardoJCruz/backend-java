public class PeterParker extends Spiderman implements PeterParkerPowers{

    // Constructor por default
    public PeterParker() {

    }

    // Constructor parametrizado super
    public PeterParker(String name, String alias, String gender, String reality, String identity) {
        super(name, alias, gender, reality, identity);
    }

    @Override
    public void shootWeb(Screen s) {
        // Limpia la pantalla
        s.cls();
        s.repaint();
        // Clase heredada de la clase Spiderman, muestra el Nombre y la Realidad con formateo de texto y estilo
        persistent(s, Colors.Desire);
        // Muestra el nombre del Poder con formato de estilo
        s.out("\tPower: Shoot Web\n", "Arial Black", 28, Colors.FussionRed);
        // Muestra la imagen del poder
        s.showImage("./img/pp-shoot-web.jpg");
        // Clase heredada de la clase Spiderman, muestra la descripcion dada con formateo de texto y estilo
        powerDescription(s, "The twin devices worn on his wrists are able to shoot thin strands of a special web fluid at high pressure and speeds.");
    }

    @Override
    public void markOfKaine(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.Desire);
        s.out("\tPower: Mark of Kaine\n", "Arial Black", 28, Colors.FussionRed);
        s.showImage("./img/pp-mark-og-kaine.jpg");
        powerDescription(s, "Kaine, the relatively amoral clone of Spider-Man, has made use of his wall-crawling abilities in a more offensive manner, burning distinctive scars in the face of his victims. Later Spider-Man himself used a variation of the same ability.");

    }

    @Override
    public void spiderSense(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.Desire);
        s.out("\tPower: Spider-Sense\n", "Arial Black", 28, Colors.FussionRed);
        s.out("                                       ");
        s.showImage("./img/pp-spider-sense.jpg");
        powerDescription(s, "Spider-Man possesses a spider sense which warns him of potential or immediate danger by the manifestation of a tingling sensation in the back of his skull");
    }
}
