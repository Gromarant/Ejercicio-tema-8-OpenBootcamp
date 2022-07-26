public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(26);
        persona.setNombre("Luis");
        persona.setTelefono(8885782);

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();

        System.out.println("nombre: " + nombre );
        System.out.println("Edad: " + edad );
        System.out.println("Telefono: " + telefono );
    }
}