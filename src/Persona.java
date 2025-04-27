public class Persona {
    public String nombre, nacionalidad;
    public int edad;

    public void presentarse(){
        System.out.println("\n------!Hola a todos¡------\n");
        System.out.println("Mi nombre es "+nombre+"\n"+"Soy de "+nacionalidad+"\n"+"Y tengo "+edad);
    }
}