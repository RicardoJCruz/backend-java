package practicaMona;

public class Nuxtocat extends Octocat{

    public Nuxtocat() {
        setNombre("NUXtocat");
        setApariencia("Sostiene un control holografico y un dispositivo para saludar");
        setActividad("Juega con el holograma de una mariposa y saluda con su dispositivo");
    }

    @Override
    public void accion() {  System.out.println("OwO");  }
}
