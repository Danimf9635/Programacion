public class Ejercicio5 {

    private static final String aplicacion="MiApp";
    private static final String version ="MiApp";
    private static final double numeroPi= 3.14159;

    static void main(String[] args) {
        String usuarioActual= "Laura";
        int nivel= 1;
        int puntacion= 0;
        System.out.println("Nombre de la app: "+aplicacion);
        System.out.println("\nVersion: "+version);
        System.out.println("\nvalor de PI: "+numeroPi);
        System.out.println("\nUsuario actual: "+usuarioActual);
        System.out.println("\nNivel: "+nivel);
        System.out.println("\nPuntuación: "+puntacion);
        System.out.println("\nINFORMACIÓN ACTUALIZADA");
        usuarioActual="Miguel";
        nivel= 2;
        puntacion=150;
        System.out.println("\nUsuario actualizado:"+usuarioActual);
        System.out.println("\nNivel actualizado: "+nivel);
        System.out.println("\nPuntuación actualizada: "+puntacion);
    }
}
