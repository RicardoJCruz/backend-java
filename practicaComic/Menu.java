public class Menu implements Runnable {
    Screen s;

    public Menu(Screen screen) {
        this.s = screen;
    }

    // Muestra un menu persistente para que el usuario manipule la reproducción
    @Override
    public void run() {
        Dialog d = new Dialog();
        while (true) {
            String c = d.readString("Escribe:\n1 para Pausar\n2 para Reanudar\n3 para Salir");
            if (c.charAt(0) == '1') {
                s.out("PAUSE", "Century Schoolbook L", 28, Colors.ORANGE);
            } else if (c.charAt(0) == '2')
                s.out("PLAY", "Century Schoolbook L", 28, Colors.ORANGE);
            else if (c.charAt(0) == '3')
                System.exit(0);
            else {
                s.out("Invalid option", "Century Schoolbook L", 28, Colors.ORANGE);
            }
        }
    }
}
