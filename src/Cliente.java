public class Cliente {

    // tiene atributos variables caracteristicas

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String correo;
    private String numCliente;
    private char genero;
    private Integer edad;

    private CarritoDeCompras carrito;

    //metodos funciones acciones

    public void agregarProducto(Producto p){

        carrito.getProductos().add(p);
    }

    public void quitarProductos(Producto p)
    {
        carrito.getProductos().remove(p);
    }

    public void pagar(){
        System.out.println("voy a pagar mi carrito de compras");
        System.out.println("El total a pagar es de :"+carrito.obtenerTotal());
        System.out.println("pagando");
    }

    //constructor
    public Cliente(){




    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public CarritoDeCompras getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoDeCompras carrito) {
        this.carrito = carrito;
    }


    //sets and gets


}
