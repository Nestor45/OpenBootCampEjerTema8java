public class App {
    public static void main(String[] args) throws Exception {
        
        Persona persona = new Persona();
        
        persona.setNombre("Rosa");
        persona.setApellido("Gonzalez");
        persona.setEdad(19);
        persona.setTelefono(1212343445);

        String nombreCompleto = persona.getNombre() +" "+ persona.getApellido();
        int edadPersona = persona.getEdad();

        System.out.println("El nombre de la persona es: "+nombreCompleto+"\nSu edad es: "+ edadPersona +" años \nSu numero de telefono es: "+persona.getTelefono());
    }
    
}
class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono; 

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}