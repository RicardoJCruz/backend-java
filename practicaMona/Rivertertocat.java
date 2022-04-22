package practicaMona;

public class Rivertertocat extends Octocat{

    public Rivertertocat() {
        setNombre("Mona the Rivertertocat");
        setApariencia("Overol azul y bandana roja");
        setActividad("Remachadora, es un simbolo del feminismo");
    }

    @Override
    public void accion() {
        System.out.println("We Can Do It! \\(^O^)/");
    }
}
