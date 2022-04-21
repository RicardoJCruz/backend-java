package practicaHarry;

public class Hogwarts {
    public static void main(String[] args) {
        harry();
        hermione();
        luna();
        draco();
        severus();
    }

    private static void harry() {
        Personaje harry = new Personaje("Harry Potter", "Masculino", "Gryffindor", "Dementor", "Ciervo");
        System.out.println(harry.showMessage());
        System.out.println("--------------");
    }

    private static void hermione() {
        Personaje hermione = new Personaje();
        hermione.setNombre("Hermione Granger");
        hermione.setGenero("Femenino");
        hermione.setCasa("Gryffindor");
        hermione.setBoggart("Fracaso");
        hermione.setPatronus("Nutria");
        System.out.println(hermione.showMessage());
        System.out.println("--------------");
    }

    private static void luna() {
        Personaje luna = new Personaje("Luna Lovegood", "Femenino", "Ravenclaw", "Desconocido", "Liebre");
        System.out.println("Nombre: " + luna.getNombre());
        System.out.println("Genero: " + luna.getGenero());
        System.out.println("Casa: " + luna.getCasa());
        System.out.println("Boggart: " + luna.getBoggart());
        System.out.println("Patronus: " + luna.getPatronus());
        System.out.println("--------------");
    }

    private static void draco() {
        Personaje draco = new Personaje();
        draco.setNombre("Draco Malfoy");
        draco.setGenero("Masculino");
        draco.setCasa("Slytherin");
        draco.setBoggart("Lord Voldemort");
        draco.setPatronus("Ninguno");
        System.out.println("Nombre: " + draco.getNombre());
        System.out.println("Genero: " + draco.getGenero());
        System.out.println("Casa: " + draco.getCasa());
        System.out.println("Boggart: " + draco.getBoggart());
        System.out.println("Patronus: " + draco.getPatronus());
        System.out.println("--------------");
    }

    private static void severus() {
        Personaje severus = new Personaje("Severus Snape", "Masculino", "Slytherin", "Lord Voldemort", "Cierva");
        System.out.println(severus.showMessage());
        System.out.println("--------------");
    }
}
