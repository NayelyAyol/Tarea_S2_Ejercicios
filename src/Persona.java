public class Persona {
    //definir los atributos
    public String nombre, nacionalidad;
    public int edad;

    //Crear un metodo para mostrar la informacion
    public void presentarse(){
        System.out.println("\n------!Hola a todos¡------\n");
        System.out.println("Mi nombre es "+nombre+"\n"+"Soy de "+nacionalidad+"\n"+"Y tengo "+edad);
    }
}