public class Play {
    public static void main(String[] args) throws InterruptedException {
        // Crea los objetos Screen y Dialog
        Screen s = makeScreen();
        Dialog d = new Dialog();

        // Los ifs verifican si el programa debe ser terminado
        if (peter(s,d) != 0) {
            // Termina el programa
            System.exit(0);
        }
        if (gwen(s, d) != 0) {
            System.exit(0);
        }
        if (karn(s, d) != 0) {
            System.exit(0);
        }

        // Termina el programa con status satisfactorio
        System.exit(0);
    }

    // Devuelve un objeto Screen
    static Screen makeScreen() {
        // Crea el objeto Screen con titulo
        Screen s = new Screen("Spiderverse");
        s.setVisible(true);
        // Define la posicion y dimensiones del Screen, favor de no modificar
        s.setBounds(200, 50, 880, 1000);
        return s;
    }

    static int peter(Screen s, Dialog d) throws InterruptedException {
        // Crea un objeto PeterParker que extiende de la clase Spiderman e implementa la clase PeterParkerPowers
        // Contructor parametrizado
        PeterParker p = new PeterParker(
                "Peter Parker", "Spider-Man",
                "Male ♂", "Earth-616",
                "Secret"
        );

        // Muestra el poder del objeto
        p.shootWeb(s);
        // Muestra un dialogo y evalua la respuesta para continuar a la siguiente imagen
        // o terminar el programa
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            // Termina el programa
            return 1;
        }
        p.markOfKaine(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        p.spiderSense(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        // No termina el programa
        return 0;
    }

    static int gwen(Screen s, Dialog d) throws InterruptedException {
        GwenStacy g = new GwenStacy(
                "Gwen Stacy", "Ghost-Spider",
                "Female ♀", "Earth-65",
                "Public"
        );

        g.shootWeb(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        g.DimesionalTravel(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        return 0;
    }

    static int karn(Screen s, Dialog d) throws InterruptedException {
        // Objeto creado con constructor por default, tiene atributos por default
        Karn k = new Karn();

        k.portalCreation(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        k.realityManipulation(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        k.staff(s);
        // Muestra un dialogo para comunicar que se llego al final del programa
        d.display("End of program");
        return 0;
    }
}
