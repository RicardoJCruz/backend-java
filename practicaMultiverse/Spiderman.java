import java.awt.Color;

public class Spiderman {
    // Atributos de la clase Spiderman
    private String name;
    private String alias;
    private String gender;
    private String reality;
    private String identity;

    // Constructor por default
    public Spiderman() {

    }

    // Constructor parametrizado
    public Spiderman(String name, String alias, String gender, String reality, String identity) {
        this.name = name;
        this.alias = alias;
        this.gender = gender;
        this.reality = reality;
        this.identity = identity;
    }

    // Getters
    public String getName() {  return name;  }
    public String getAlias() {  return alias;  }
    public String getGender() {  return gender;  }
    public String getReality() {  return reality;  }
    public String getIdentity() {  return identity;  }

    // Setters
    public boolean setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean setAlias(String alias) {
        if (!alias.isEmpty()) {
            this.alias = alias;
            return true;
        }
        return false;
    }

    public boolean setGender(String gender) {
        if (!gender.isEmpty()) {
            this.gender = gender;
            return true;
        }
        return false;
    }

    public boolean setReality(String reality) {
        if (!reality.isEmpty()) {
            this.reality = reality;
            return true;
        }
        return false;
    }

    public boolean setIdentity(String identity) {
        if (!identity.isEmpty()) {
            this.identity = identity;
            return true;
        }
        return false;
    }

    // Metodos
    public void persistent(Screen s) {
        // Nombre del Spiderman y Realidad con formato de texto
        String outName = "\t\t\t\t" + name + " (" + reality + ")" + "\n\n";
        // Informacion del Spiderman con formato de texto
        String outInfo = "   \uD83D\uDD78 Alias: " + alias + "\t   \uD83D\uDD78 " + gender + "\t   \uD83D\uDD78 Identity: " + identity + "\n\n";
        // Muestra outName con formato de estilo
        s.out(outName, "Helvetica", 40, Colors.Desire);
        // Muestra la información del Spiderman
        s.out(outInfo);
    }

    // Overloading
    public void persistent(Screen s, Color c) {
        // Hace lo mismo que persisten(Screen s) pero acepta un color personalizado
        String outName = "\t\t\t  " + name + "  (" + reality + ")" + "\n\n";
        String outInfo = "   \uD83D\uDD78 Alias: " + alias + "\t   \uD83D\uDD78 " + gender + "\t   \uD83D\uDD78 Identity: " + identity + "\n\n";
        s.out(outName, "Impact", 40, c);
        s.out(outInfo, "MV Boli", 24, Colors.PrestigeBlue);
    }

    // Muestra la descripcion del Poder en turno
    public void powerDescription(Screen s, String description) {
        // Almacena la descipcion y le da formato de texto
        String outDescription = "\n  " + description + "\n";
        // Muestra la descripciion con formato de estilo
        s.out(outDescription,"Corbel", 30, Colors.PrestigeBlue);
    }

    // Regresa la descripcion del Spiderman
    public String showMessage() {
        return "name: " + name + "\nalias: " + alias +
                "\ngender: " + gender + "\nreality: " +
                reality + "\nidentity: " + identity + "\n";
    }
}