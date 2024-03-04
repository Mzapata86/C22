public class TrabajoEnClase2 {
    // Atributos de la clase Celular
    private String marca;
    private String tamano;
    private String modelo;
    private String camara;

    // Constructor de la clase Celular
    public TrabajoEnClase2(String marca, String tamano, String modelo, String camara) {
        this.marca = marca;
        this.tamano = tamano;
        this.modelo = modelo;
        this.camara = camara;
    }

    // Métodos de la clase Celular
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void imagen() {
        System.out.println("Se muestra imagen");
    }

    public void sonido() {
        System.out.println("Se emite sonido");
    }

    public void aplicaciones() {
        System.out.println("Se descargan las aplicaciones en la AppStore");
    }

    public static void main(String[] args) {
        // Crear un objeto Celular
        TrabajoEnClase2 celular = new TrabajoEnClase2("Apple", "6", "Iphone 11", "4K");

        // Acceder a los métodos del Televisor
        celular.imagen();
        celular.sonido();
        celular.aplicaciones();
    }
}