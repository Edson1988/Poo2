public class Producto {

    //atributos  variables
    // caracteristicas

    private String nombre;
    private String descripcion;
    private String marca;
    private Double precio;
    private String codigo;
    private Float capacidad;
    private String medida;
    private Boolean disponible;



    //metodos funciones acciones




    //constructor

    public Producto()
    {

       /* nombre="";
        descripcion="";
        marca="";
        precio=0.0;
        codigo="";
        capacidad=0.0f;
        medida="";
        disponible=false;*/
    }

// gets and sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Float capacidad) {
        this.capacidad = capacidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
