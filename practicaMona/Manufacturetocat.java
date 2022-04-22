package practicaMona;

public class Manufacturetocat extends Octocat{

    public Manufacturetocat() {
        setNombre("Manufacturetocat");
        setApariencia("Overol azul y casco amarillo");
        setActividad("Supervisa la cadena de manufactura");
    }

    @Override
    public void accion() {  System.out.println("Focus on the job (@_@)");  }

}
