public class ProgramaPersona {
    public static void main(String[] args) {
        //Crear una nueva instancia
        Persona persona1=new Persona();

        //Dar valores a los atributos
        persona1.nombre="Liam";
        persona1.nacionalidad="Italia";
        persona1.edad=20;
        
        //Llamar al metodo para mostrar la informacion
        persona1.presentarse();
    }
}