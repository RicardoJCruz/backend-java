package practicaMona;

public class Octocat {
    private String nombre = "Octocat", apariencia = "Sin vestimenta", actividad = "Saludar a los githubbers";

    public Octocat() {
    }

    // Getters
    public String getNombre() {  return nombre;  }
    public String getApariencia() {  return apariencia;  }
    public String getActividad() {  return actividad;  }

    // Setters
    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    public boolean setApariencia(String apariencia) {
        if(!apariencia.isEmpty()) {
            this.apariencia = apariencia;
            return true;
        }
        return false;
    }

    public boolean setActividad(String actividad) {
        if(!actividad.isEmpty()) {
            this.actividad = actividad;
            return true;
        }
        return false;
    }

    // Metodos
    public void accion() {
        System.out.println("Hello, world! (^_^)/~");
    }

    // Ocerloading del metodo accion()
    public boolean accion(String mensaje) {
        if(!mensaje.isEmpty()) {
            System.out.println(mensaje + "! (^_^)/~");
            return true;
        }
        return false;
    }

    public String showMessage() {
        return nombre + "\nLook: " + apariencia + "\nActividad: " + actividad;
    }
}