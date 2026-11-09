public abstract class Producto {
    protected String id;
    protected String nombre;
    protected double precio;

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método abstracto que obligará a las subclases a mostrar sus atributos específicos
    public abstract void mostrarDetalles();

    public String getNombre() {
        return nombre;
    }
}
