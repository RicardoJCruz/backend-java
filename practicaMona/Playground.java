package practicaMona;

public class Playground {

    public static void main(String[] args) {
        octocat();
        yogitocat();
        rivertertocat();
        mioctocat();
        manufacturetocat();
        nuxtocat();

        // Subtype polymorphism
        mejoresAmigos(new Octocat(), new Yogitocat(), new Rivertertocat());
    }

    static void octocat() {
        Octocat octocat = new Octocat();
        System.out.println(octocat.showMessage());
        octocat.accion();
        System.out.println();
    }

    static void yogitocat() {
        Yogitocat yogitocat = new Yogitocat();
        System.out.println(yogitocat.showMessage());
        yogitocat.accion();
        System.out.println();
    }

    static void rivertertocat() {
        Rivertertocat river = new Rivertertocat();
        System.out.println(river.showMessage());
        river.accion();
        System.out.println();
    }

    static void mioctocat() {
        Octocat octo = new Octocat();
        octo.setNombre("Terminatocat");
        octo.setApariencia("Traje de motociclista y gafas de sol");
        octo.setActividad("Viajar al pasado para eliminar a Sahra Connor");
        System.out.println(octo.showMessage());
        octo.accion("Hasta la vista, baby");
        System.out.println();
    }

    static void manufacturetocat() {
        Manufacturetocat manu = new Manufacturetocat();
        System.out.println(manu.showMessage());
        manu.accion();
        System.out.println();
    }

    static void nuxtocat() {
        Nuxtocat nux = new Nuxtocat();
        System.out.println(nux.showMessage());
        nux.accion();
        System.out.println();
    }

    // Subtype polymorphism
    static void mejoresAmigos(Octocat obj1, Octocat obj2, Octocat obj3) {
        System.out.println(obj1.getNombre() + ", " + obj2.getNombre() + " y " + obj3.getNombre() + " son mejores amigos");
    }
}